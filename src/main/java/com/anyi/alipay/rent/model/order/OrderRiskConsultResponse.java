package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

import java.util.List;

@Data
public class OrderRiskConsultResponse implements BaseResponse {
    private String code;
    private String msg;

    private String productEdition;
    private List<RentRiskInfoVO> riskInfos;
    private List<ConsultFailReason> consultFailReason;
    private RiskBasicInfoVO riskBasicInfo;
    private String vamGroup;
    private RentRiskProVO extremelyLowRiskModels;
    private RentRiskProVO comprehensiveRiskModels;
    private ShipGoodsRiskVO shipGoodsRiskModels;

}