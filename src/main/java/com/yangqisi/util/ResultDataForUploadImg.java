package com.yangqisi.util;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 自定义响应结构
 */
public class ResultDataForUploadImg {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer error;

    // 响应消息
    private String message;

    // 响应中的数据
    private Object data;
    
    private String title;
    
    private String url;
    
    private int width;
    
    private int height;
    
    private int border;
    
    private String align;
    
    //data.width, data.height, data.border, data.align

    public static ResultDataForUploadImg build(Integer status, String message, Object data) {
        return new ResultDataForUploadImg(status, message, data);
    }

    public static ResultDataForUploadImg ok(Object data) {
        return new ResultDataForUploadImg(data);
    }

    public static ResultDataForUploadImg ok() {
        return new ResultDataForUploadImg(null);
    }

    public ResultDataForUploadImg() {

    }

    public static ResultDataForUploadImg build(Integer status, String message) {
        return new ResultDataForUploadImg(status, message, null);
    }

    public ResultDataForUploadImg(Integer status, String message, Object data) {
        this.error = status;
        this.message = message;
        this.data = data;
    }

    public ResultDataForUploadImg(Object data) {
        this.error = 200;
        this.message = "OK";
        this.data = data;
    }

//    public Boolean isOK() {
//        return this.status == 200;
//    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为Result对象
     * 
     * @param jsonData json数据
     * @param clazz Result中的object类型
     * @return
     */
    public static ResultDataForUploadImg formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, ResultDataForUploadImg.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     */
    public static ResultDataForUploadImg format(String json) {
        try {
            return MAPPER.readValue(json, ResultDataForUploadImg.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     * 
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
    public static ResultDataForUploadImg formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

	public Integer getError() {
		return error;
	}

	public void setError(Integer error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBorder() {
		return border;
	}

	public void setBorder(int border) {
		this.border = border;
	}

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

}
