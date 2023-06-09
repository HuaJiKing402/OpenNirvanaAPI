package top.bianstudio.OpenNirvanaAPI.v1;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import top.bianstudio.OpenNirvanaAPI.Model.ResultCode;

/**
 * OpenBianAPI v1响应结果封装
 */

@Data
// 非空返回
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Result {
    private int code;
    private String message = "success";
    private Object data;

    public Result setCode(ResultCode resultCode){
        this.code = resultCode.code;
        return this;
    }

    public Result setMessage(String message){
        this.message = message;
        return this;
    }

    public Result setData(Object data){
        this.data = data;
        return this;
    }
}
