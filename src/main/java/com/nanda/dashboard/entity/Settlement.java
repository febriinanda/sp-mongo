package com.nanda.dashboard.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Settlement {
    @Id
    private String MsgId;
    private String CreDtTm;
    private String AddtlInf;
    private String CdtrAcctId;
    private String CdtrAcctTp;
    private String CdtrAgtId;
    private String CdtrNm;
    private String DbtrAcctId;
    private String DbtrAcctTp;
    private String DbtrAgtId;
    private String DbtrNm;
    private String IntrBkSttlmDt;
    private String OrgnlEndToEndId;
    private String Prtry;
    private String TxSts;
}
