package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.RentInstallmentInfo;
import com.alipay.api.domain.RentPlanCancelInfo;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
public class OrderRentplaninfoAppendRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private Date rent_end_time;
    /**
     * 【枚举值】
     * 追加租赁计划: APPEND
     * 取消追加租赁计划: CANCEL_APPEND
     * 【注意事项】不填写，默认为 APPEND
     */
    @NotBlank private String type;
    @NotBlank private String orderId;
    @NotBlank private String openId;

    /* ======== 条件必填 ======== */

    private List<RentInstallmentInfo> installments; //当 type == APPEND 或者 不传入时，必填

    private RentPlanCancelInfo cancelInfo;    //当 type == CANCEL_APPEND 时，必填


}

