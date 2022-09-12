package com.podong.game.module.schduling.bean;

import com.podong.game.common.bean.PostFixVO;
import lombok.Data;

@Data
public class GameCompanyVO extends PostFixVO {
    private String gameCompanyCid;   // 게임메카 업체고유번호
    private String gameCompanyName;  // 게임업체 명
    private String gameCompanyTel;   // 게임업체 전화번호
    private String gameCompanyAddr;  // 게임업체 주소
    private String gameCompanySite;  // 게임업체 사이트
    private String gameCompanyImg;   // 게임업체 이미지
    private String useYn;            // 사용여부
}
