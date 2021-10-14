package com.stcc.common.core.domain;

import com.stcc.common.core.constants.UniversalConstant;

import java.io.Serializable;

/**
 * 包名 com.stcc.common.core.domain
 * 说明 响应信息主体
 * 创建时间 2021/10/9
 * @author stcc
 */
public class ResponseBase<T> implements Serializable {
    public ResponseBase() {
    }
    private static final long serialVersionUID = 1L;
    /** 成功 */
    public static final int SUCCESS = UniversalConstant.SUCCESS;

    /** 失败 */
    public static final int FAIL = UniversalConstant.FAIL;

    private int code;

    private String msg;

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResponseBase<T> ok()
    {
        return restResult(null, SUCCESS, null);
    }

    public static <T> ResponseBase<T> ok(T data)
    {
        return restResult(data, SUCCESS, null);
    }

    public static <T> ResponseBase<T> ok(T data, String msg)
    {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> ResponseBase<T> fail()
    {
        return restResult(null, FAIL, null);
    }

    public static <T> ResponseBase<T> fail(String msg)
    {
        return restResult(null, FAIL, msg);
    }

    public static <T> ResponseBase<T> fail(T data)
    {
        return restResult(data, FAIL, null);
    }

    public static <T> ResponseBase<T> fail(T data, String msg)
    {
        return restResult(data, FAIL, msg);
    }

    public static <T> ResponseBase<T> fail(int code, String msg)
    {
        return restResult(null, code, msg);
    }

    private static <T> ResponseBase<T> restResult(T data, int code, String msg)
    {
        ResponseBase<T> apiResult = new ResponseBase<T>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
