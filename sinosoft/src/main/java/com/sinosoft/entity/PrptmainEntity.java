package com.sinosoft.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "PRPTMAIN")
public class PrptmainEntity {
    private String proposalno;
    private String classcode;
    private String riskcode;
    private String contractno;
    private String policysort;
    private String printno;
    private String businessnature;
    private String language;
    private String policytype;
    private String applicode;
    private String appliname;
    private String appliaddress;
    private String insuredcode;
    private String insuredname;
    private String insuredaddress;
    private Time operatedate;
    private Time startdate;
    private Long starthour;
    private Time enddate;
    private Long endhour;
    private Long purerate;
    private Long disrate;
    private Long discount;
    private String currency;
    private Long sumvalue;
    private Long sumamount;
    private Long sumdiscount;
    private Long sumpremium;
    private Long sumsubprem;
    private Long sumquantity;
    private String judicalcode;
    private String judicalscope;
    private String autotransrenewflag;
    private String arguesolution;
    private String arbitboardname;
    private Long paytimes;
    private Long endorsetimes;
    private Long claimtimes;
    private String makecom;
    private String operatesite;
    private String comcode;
    private String handlercode;
    private String handler1Code;
    private String approvercode;
    private String underwritecode;
    private String underwritename;
    private String operatorcode;
    private Time inputdate;
    private Long inputhour;
    private Time underwriteenddate;
    private Time statisticsym;
    private String agentcode;
    private String coinsflag;
    private String reinsflag;
    private String allinsflag;
    private String underwriteflag;
    private String othflag;
    private String flag;
    private Long disrate1;
    private String businessflag;
    private String updatercode;
    private Time updatedate;
    private String updatehour;
    private Time signdate;
    private String shareholderflag;
    private String agreementno;
    private String inquiryno;
    private String paymode;
    private String remark;
    private String policyno;
    private String visacode;
    private String manualtype;
    private String nationflag;
    private Long startminute;
    private Long endminute;
    private String jfeeflag;
    private Time precheckdate;
    private String handlername;
    private String handler1Name;
    private String payrefcode;
    private String payrefname;
    private Time payreftime;
    private Time printtime;
    private String agritype;
    private String subbusinessnature;
    private String agrinature;
    private String serviceproviders;
    private String servicetype;
    private String services;
    private String billingway;
    private String businesschannel;
    private String businessagenttype;
    private String uniteagentchannel;
    private String businesskind;
    private String invoiceman;
    private String cardcname;
    private String formatpolicycode;
    private String jfeepaytype;
    private String quotationno;
    private String additionalflag;
    private String agentoperateflag;
    private String printstatus;
    private String ifremote;
    private String ifmedical;
    private String ifbidding;
    private String ifspecialcase;
    private String specialcasedesc;
    private String computerip;
    private String usbkey;
    private String posno;
    private String approvename;
    private String approvecode;
    private String ifblanket;
    private String ifendorse;
    private String iftotalblanket;
    private String ifremoteblanket;
    private String ifremotecoins;
    private String ifengagecoins;
    private String ifpackage;
    private String iffirstpolicy;
    private String iftradepaul;
    private String blanketpolicyno;
    private String lesseename;
    private String leasecontractnumber;
    private String leasecontractname;
    private String waittime;
    private Long maxamount;
    private Time maxstartdate;
    private Long maxstarthour;
    private Time maxenddate;
    private Long maxendhour;
    private String facilityaddress;
    private String facilitycode;
    private String areacode;
    private String anstallmentflag;
    private String ifprpall;
    private String ifcentralized;
    private String ifbankprpall;
    private Time recorddate;
    private String businesstypeflag;
    private String specialtype;
    private String nettype;
    private String roadbranchcode;
    private String roadbranchname;
    private String edittype;
    private String rulecheckserialno;
    private String realtimeclaimflag;
    private String isneedepolicy;
    private String issendclient;
    private Time stopdrivingdate;
    private Long stopdrivinghour;
    private Time startdrivingdate;
    private Long startdrivinghour;
    private String businessmodecode;
    private String businessmodename;
    private String insuredperiodunit;
    private Long insuredperiodvalue;
    private Long avgage;
    private String carcoverage;
    private Time initialstartdate;
    private Long terminationdate;
    private String arbitboardaddress;
    private String issuecode;
    private String shortrateflag;
    private String endorshortrateflag;
    private Long shortrate;
    private Long endorshortrate;
    private Long expectdiscount;
    private String salesname;
    private String commercenature;
    private Long deductiblerate;
    private Long expectsturmlioville;
    private String addedtaxfee;
    private String nohavetaxfee;
    private Time epolicytime;
    private String issuecodeupdatedate;
    private String makeinvoice;
    private String agreementdate;
    private String facilitatorcode;
    private String quoteNo;
    private String followdate;
    private String creditcontractno;
    private String isneedeproposal;
    private String contractstatus;
    private Long paytimespg;
    private String vaidcode;

    public PrptmainEntity(String proposalno, String classcode, String riskcode, String contractno, String policysort, String printno, String businessnature, String language, String policytype, String applicode, String appliname, String appliaddress, String insuredcode, String insuredname, String insuredaddress, Time operatedate, Time startdate, Long starthour, Time enddate, Long endhour, Long purerate, Long disrate, Long discount, String currency, Long sumvalue, Long sumamount, Long sumdiscount, Long sumpremium, Long sumsubprem, Long sumquantity, String judicalcode, String judicalscope, String autotransrenewflag, String arguesolution, String arbitboardname, Long paytimes, Long endorsetimes, Long claimtimes, String makecom, String operatesite, String comcode, String handlercode, String handler1Code, String approvercode, String underwritecode, String underwritename, String operatorcode, Time inputdate, Long inputhour, Time underwriteenddate, Time statisticsym, String agentcode, String coinsflag, String reinsflag, String allinsflag, String underwriteflag, String othflag, String flag, Long disrate1, String businessflag, String updatercode, Time updatedate, String updatehour, Time signdate, String shareholderflag, String agreementno, String inquiryno, String paymode, String remark, String policyno, String visacode, String manualtype, String nationflag, Long startminute, Long endminute, String jfeeflag, Time precheckdate, String handlername, String handler1Name, String payrefcode, String payrefname, Time payreftime, Time printtime, String agritype, String subbusinessnature, String agrinature, String serviceproviders, String servicetype, String services, String billingway, String businesschannel, String businessagenttype, String uniteagentchannel, String businesskind, String invoiceman, String cardcname, String formatpolicycode, String jfeepaytype, String quotationno, String additionalflag, String agentoperateflag, String printstatus, String ifremote, String ifmedical, String ifbidding, String ifspecialcase, String specialcasedesc, String computerip, String usbkey, String posno, String approvename, String approvecode, String ifblanket, String ifendorse, String iftotalblanket, String ifremoteblanket, String ifremotecoins, String ifengagecoins, String ifpackage, String iffirstpolicy, String iftradepaul, String blanketpolicyno, String lesseename, String leasecontractnumber, String leasecontractname, String waittime, Long maxamount, Time maxstartdate, Long maxstarthour, Time maxenddate, Long maxendhour, String facilityaddress, String facilitycode, String areacode, String anstallmentflag, String ifprpall, String ifcentralized, String ifbankprpall, Time recorddate, String businesstypeflag, String specialtype, String nettype, String roadbranchcode, String roadbranchname, String edittype, String rulecheckserialno, String realtimeclaimflag, String isneedepolicy, String issendclient, Time stopdrivingdate, Long stopdrivinghour, Time startdrivingdate, Long startdrivinghour, String businessmodecode, String businessmodename, String insuredperiodunit, Long insuredperiodvalue, Long avgage, String carcoverage, Time initialstartdate, Long terminationdate, String arbitboardaddress, String issuecode, String shortrateflag, String endorshortrateflag, Long shortrate, Long endorshortrate, Long expectdiscount, String salesname, String commercenature, Long deductiblerate, Long expectsturmlioville, String addedtaxfee, String nohavetaxfee, Time epolicytime, String issuecodeupdatedate, String makeinvoice, String agreementdate, String facilitatorcode, String quoteNo, String followdate, String creditcontractno, String isneedeproposal, String contractstatus, Long paytimespg, String vaidcode) {
        this.proposalno = proposalno;
        this.classcode = classcode;
        this.riskcode = riskcode;
        this.contractno = contractno;
        this.policysort = policysort;
        this.printno = printno;
        this.businessnature = businessnature;
        this.language = language;
        this.policytype = policytype;
        this.applicode = applicode;
        this.appliname = appliname;
        this.appliaddress = appliaddress;
        this.insuredcode = insuredcode;
        this.insuredname = insuredname;
        this.insuredaddress = insuredaddress;
        this.operatedate = operatedate;
        this.startdate = startdate;
        this.starthour = starthour;
        this.enddate = enddate;
        this.endhour = endhour;
        this.purerate = purerate;
        this.disrate = disrate;
        this.discount = discount;
        this.currency = currency;
        this.sumvalue = sumvalue;
        this.sumamount = sumamount;
        this.sumdiscount = sumdiscount;
        this.sumpremium = sumpremium;
        this.sumsubprem = sumsubprem;
        this.sumquantity = sumquantity;
        this.judicalcode = judicalcode;
        this.judicalscope = judicalscope;
        this.autotransrenewflag = autotransrenewflag;
        this.arguesolution = arguesolution;
        this.arbitboardname = arbitboardname;
        this.paytimes = paytimes;
        this.endorsetimes = endorsetimes;
        this.claimtimes = claimtimes;
        this.makecom = makecom;
        this.operatesite = operatesite;
        this.comcode = comcode;
        this.handlercode = handlercode;
        this.handler1Code = handler1Code;
        this.approvercode = approvercode;
        this.underwritecode = underwritecode;
        this.underwritename = underwritename;
        this.operatorcode = operatorcode;
        this.inputdate = inputdate;
        this.inputhour = inputhour;
        this.underwriteenddate = underwriteenddate;
        this.statisticsym = statisticsym;
        this.agentcode = agentcode;
        this.coinsflag = coinsflag;
        this.reinsflag = reinsflag;
        this.allinsflag = allinsflag;
        this.underwriteflag = underwriteflag;
        this.othflag = othflag;
        this.flag = flag;
        this.disrate1 = disrate1;
        this.businessflag = businessflag;
        this.updatercode = updatercode;
        this.updatedate = updatedate;
        this.updatehour = updatehour;
        this.signdate = signdate;
        this.shareholderflag = shareholderflag;
        this.agreementno = agreementno;
        this.inquiryno = inquiryno;
        this.paymode = paymode;
        this.remark = remark;
        this.policyno = policyno;
        this.visacode = visacode;
        this.manualtype = manualtype;
        this.nationflag = nationflag;
        this.startminute = startminute;
        this.endminute = endminute;
        this.jfeeflag = jfeeflag;
        this.precheckdate = precheckdate;
        this.handlername = handlername;
        this.handler1Name = handler1Name;
        this.payrefcode = payrefcode;
        this.payrefname = payrefname;
        this.payreftime = payreftime;
        this.printtime = printtime;
        this.agritype = agritype;
        this.subbusinessnature = subbusinessnature;
        this.agrinature = agrinature;
        this.serviceproviders = serviceproviders;
        this.servicetype = servicetype;
        this.services = services;
        this.billingway = billingway;
        this.businesschannel = businesschannel;
        this.businessagenttype = businessagenttype;
        this.uniteagentchannel = uniteagentchannel;
        this.businesskind = businesskind;
        this.invoiceman = invoiceman;
        this.cardcname = cardcname;
        this.formatpolicycode = formatpolicycode;
        this.jfeepaytype = jfeepaytype;
        this.quotationno = quotationno;
        this.additionalflag = additionalflag;
        this.agentoperateflag = agentoperateflag;
        this.printstatus = printstatus;
        this.ifremote = ifremote;
        this.ifmedical = ifmedical;
        this.ifbidding = ifbidding;
        this.ifspecialcase = ifspecialcase;
        this.specialcasedesc = specialcasedesc;
        this.computerip = computerip;
        this.usbkey = usbkey;
        this.posno = posno;
        this.approvename = approvename;
        this.approvecode = approvecode;
        this.ifblanket = ifblanket;
        this.ifendorse = ifendorse;
        this.iftotalblanket = iftotalblanket;
        this.ifremoteblanket = ifremoteblanket;
        this.ifremotecoins = ifremotecoins;
        this.ifengagecoins = ifengagecoins;
        this.ifpackage = ifpackage;
        this.iffirstpolicy = iffirstpolicy;
        this.iftradepaul = iftradepaul;
        this.blanketpolicyno = blanketpolicyno;
        this.lesseename = lesseename;
        this.leasecontractnumber = leasecontractnumber;
        this.leasecontractname = leasecontractname;
        this.waittime = waittime;
        this.maxamount = maxamount;
        this.maxstartdate = maxstartdate;
        this.maxstarthour = maxstarthour;
        this.maxenddate = maxenddate;
        this.maxendhour = maxendhour;
        this.facilityaddress = facilityaddress;
        this.facilitycode = facilitycode;
        this.areacode = areacode;
        this.anstallmentflag = anstallmentflag;
        this.ifprpall = ifprpall;
        this.ifcentralized = ifcentralized;
        this.ifbankprpall = ifbankprpall;
        this.recorddate = recorddate;
        this.businesstypeflag = businesstypeflag;
        this.specialtype = specialtype;
        this.nettype = nettype;
        this.roadbranchcode = roadbranchcode;
        this.roadbranchname = roadbranchname;
        this.edittype = edittype;
        this.rulecheckserialno = rulecheckserialno;
        this.realtimeclaimflag = realtimeclaimflag;
        this.isneedepolicy = isneedepolicy;
        this.issendclient = issendclient;
        this.stopdrivingdate = stopdrivingdate;
        this.stopdrivinghour = stopdrivinghour;
        this.startdrivingdate = startdrivingdate;
        this.startdrivinghour = startdrivinghour;
        this.businessmodecode = businessmodecode;
        this.businessmodename = businessmodename;
        this.insuredperiodunit = insuredperiodunit;
        this.insuredperiodvalue = insuredperiodvalue;
        this.avgage = avgage;
        this.carcoverage = carcoverage;
        this.initialstartdate = initialstartdate;
        this.terminationdate = terminationdate;
        this.arbitboardaddress = arbitboardaddress;
        this.issuecode = issuecode;
        this.shortrateflag = shortrateflag;
        this.endorshortrateflag = endorshortrateflag;
        this.shortrate = shortrate;
        this.endorshortrate = endorshortrate;
        this.expectdiscount = expectdiscount;
        this.salesname = salesname;
        this.commercenature = commercenature;
        this.deductiblerate = deductiblerate;
        this.expectsturmlioville = expectsturmlioville;
        this.addedtaxfee = addedtaxfee;
        this.nohavetaxfee = nohavetaxfee;
        this.epolicytime = epolicytime;
        this.issuecodeupdatedate = issuecodeupdatedate;
        this.makeinvoice = makeinvoice;
        this.agreementdate = agreementdate;
        this.facilitatorcode = facilitatorcode;
        this.quoteNo = quoteNo;
        this.followdate = followdate;
        this.creditcontractno = creditcontractno;
        this.isneedeproposal = isneedeproposal;
        this.contractstatus = contractstatus;
        this.paytimespg = paytimespg;
        this.vaidcode = vaidcode;
    }

    public PrptmainEntity() {
    }


    @Id
    @Column(name = "PROPOSALNO")
    public String getProposalno() {
        return proposalno;
    }

    public void setProposalno(String proposalno) {
        this.proposalno = proposalno;
    }

    @Basic
    @Column(name = "CLASSCODE",unique = true, nullable = false)
    public String getClasscode() {
        return classcode;
    }

    public void setClasscode(String classcode) {
        this.classcode = classcode;
    }

    @Basic
    @Column(name = "RISKCODE")
    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode;
    }

    @Basic
    @Column(name = "CONTRACTNO")
    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    @Basic
    @Column(name = "POLICYSORT")
    public String getPolicysort() {
        return policysort;
    }

    public void setPolicysort(String policysort) {
        this.policysort = policysort;
    }

    @Basic
    @Column(name = "PRINTNO")
    public String getPrintno() {
        return printno;
    }

    public void setPrintno(String printno) {
        this.printno = printno;
    }

    @Basic
    @Column(name = "BUSINESSNATURE")
    public String getBusinessnature() {
        return businessnature;
    }

    public void setBusinessnature(String businessnature) {
        this.businessnature = businessnature;
    }

    @Basic
    @Column(name = "LANGUAGE")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "POLICYTYPE")
    public String getPolicytype() {
        return policytype;
    }

    public void setPolicytype(String policytype) {
        this.policytype = policytype;
    }

    @Basic
    @Column(name = "APPLICODE")
    public String getApplicode() {
        return applicode;
    }

    public void setApplicode(String applicode) {
        this.applicode = applicode;
    }

    @Basic
    @Column(name = "APPLINAME")
    public String getAppliname() {
        return appliname;
    }

    public void setAppliname(String appliname) {
        this.appliname = appliname;
    }

    @Basic
    @Column(name = "APPLIADDRESS")
    public String getAppliaddress() {
        return appliaddress;
    }

    public void setAppliaddress(String appliaddress) {
        this.appliaddress = appliaddress;
    }

    @Basic
    @Column(name = "INSUREDCODE")
    public String getInsuredcode() {
        return insuredcode;
    }

    public void setInsuredcode(String insuredcode) {
        this.insuredcode = insuredcode;
    }

    @Basic
    @Column(name = "INSUREDNAME")
    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    @Basic
    @Column(name = "INSUREDADDRESS")
    public String getInsuredaddress() {
        return insuredaddress;
    }

    public void setInsuredaddress(String insuredaddress) {
        this.insuredaddress = insuredaddress;
    }

    @Basic
    @Column(name = "OPERATEDATE")
    public Time getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(Time operatedate) {
        this.operatedate = operatedate;
    }

    @Basic
    @Column(name = "STARTDATE")
    public Time getStartdate() {
        return startdate;
    }

    public void setStartdate(Time startdate) {
        this.startdate = startdate;
    }

    @Basic
    @Column(name = "STARTHOUR")
    public Long getStarthour() {
        return starthour;
    }

    public void setStarthour(Long starthour) {
        this.starthour = starthour;
    }

    @Basic
    @Column(name = "ENDDATE")
    public Time getEnddate() {
        return enddate;
    }

    public void setEnddate(Time enddate) {
        this.enddate = enddate;
    }

    @Basic
    @Column(name = "ENDHOUR")
    public Long getEndhour() {
        return endhour;
    }

    public void setEndhour(Long endhour) {
        this.endhour = endhour;
    }

    @Basic
    @Column(name = "PURERATE")
    public Long getPurerate() {
        return purerate;
    }

    public void setPurerate(Long purerate) {
        this.purerate = purerate;
    }

    @Basic
    @Column(name = "DISRATE")
    public Long getDisrate() {
        return disrate;
    }

    public void setDisrate(Long disrate) {
        this.disrate = disrate;
    }

    @Basic
    @Column(name = "DISCOUNT")
    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "CURRENCY")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "SUMVALUE")
    public Long getSumvalue() {
        return sumvalue;
    }

    public void setSumvalue(Long sumvalue) {
        this.sumvalue = sumvalue;
    }

    @Basic
    @Column(name = "SUMAMOUNT")
    public Long getSumamount() {
        return sumamount;
    }

    public void setSumamount(Long sumamount) {
        this.sumamount = sumamount;
    }

    @Basic
    @Column(name = "SUMDISCOUNT")
    public Long getSumdiscount() {
        return sumdiscount;
    }

    public void setSumdiscount(Long sumdiscount) {
        this.sumdiscount = sumdiscount;
    }

    @Basic
    @Column(name = "SUMPREMIUM")
    public Long getSumpremium() {
        return sumpremium;
    }

    public void setSumpremium(Long sumpremium) {
        this.sumpremium = sumpremium;
    }

    @Basic
    @Column(name = "SUMSUBPREM")
    public Long getSumsubprem() {
        return sumsubprem;
    }

    public void setSumsubprem(Long sumsubprem) {
        this.sumsubprem = sumsubprem;
    }

    @Basic
    @Column(name = "SUMQUANTITY")
    public Long getSumquantity() {
        return sumquantity;
    }

    public void setSumquantity(Long sumquantity) {
        this.sumquantity = sumquantity;
    }

    @Basic
    @Column(name = "JUDICALCODE")
    public String getJudicalcode() {
        return judicalcode;
    }

    public void setJudicalcode(String judicalcode) {
        this.judicalcode = judicalcode;
    }

    @Basic
    @Column(name = "JUDICALSCOPE")
    public String getJudicalscope() {
        return judicalscope;
    }

    public void setJudicalscope(String judicalscope) {
        this.judicalscope = judicalscope;
    }

    @Basic
    @Column(name = "AUTOTRANSRENEWFLAG")
    public String getAutotransrenewflag() {
        return autotransrenewflag;
    }

    public void setAutotransrenewflag(String autotransrenewflag) {
        this.autotransrenewflag = autotransrenewflag;
    }

    @Basic
    @Column(name = "ARGUESOLUTION")
    public String getArguesolution() {
        return arguesolution;
    }

    public void setArguesolution(String arguesolution) {
        this.arguesolution = arguesolution;
    }

    @Basic
    @Column(name = "ARBITBOARDNAME")
    public String getArbitboardname() {
        return arbitboardname;
    }

    public void setArbitboardname(String arbitboardname) {
        this.arbitboardname = arbitboardname;
    }

    @Basic
    @Column(name = "PAYTIMES")
    public Long getPaytimes() {
        return paytimes;
    }

    public void setPaytimes(Long paytimes) {
        this.paytimes = paytimes;
    }

    @Basic
    @Column(name = "ENDORSETIMES")
    public Long getEndorsetimes() {
        return endorsetimes;
    }

    public void setEndorsetimes(Long endorsetimes) {
        this.endorsetimes = endorsetimes;
    }

    @Basic
    @Column(name = "CLAIMTIMES")
    public Long getClaimtimes() {
        return claimtimes;
    }

    public void setClaimtimes(Long claimtimes) {
        this.claimtimes = claimtimes;
    }

    @Basic
    @Column(name = "MAKECOM")
    public String getMakecom() {
        return makecom;
    }

    public void setMakecom(String makecom) {
        this.makecom = makecom;
    }

    @Basic
    @Column(name = "OPERATESITE")
    public String getOperatesite() {
        return operatesite;
    }

    public void setOperatesite(String operatesite) {
        this.operatesite = operatesite;
    }

    @Basic
    @Column(name = "COMCODE")
    public String getComcode() {
        return comcode;
    }

    public void setComcode(String comcode) {
        this.comcode = comcode;
    }

    @Basic
    @Column(name = "HANDLERCODE")
    public String getHandlercode() {
        return handlercode;
    }

    public void setHandlercode(String handlercode) {
        this.handlercode = handlercode;
    }

    @Basic
    @Column(name = "HANDLER1CODE")
    public String getHandler1Code() {
        return handler1Code;
    }

    public void setHandler1Code(String handler1Code) {
        this.handler1Code = handler1Code;
    }

    @Basic
    @Column(name = "APPROVERCODE")
    public String getApprovercode() {
        return approvercode;
    }

    public void setApprovercode(String approvercode) {
        this.approvercode = approvercode;
    }

    @Basic
    @Column(name = "UNDERWRITECODE")
    public String getUnderwritecode() {
        return underwritecode;
    }

    public void setUnderwritecode(String underwritecode) {
        this.underwritecode = underwritecode;
    }

    @Basic
    @Column(name = "UNDERWRITENAME")
    public String getUnderwritename() {
        return underwritename;
    }

    public void setUnderwritename(String underwritename) {
        this.underwritename = underwritename;
    }

    @Basic
    @Column(name = "OPERATORCODE")
    public String getOperatorcode() {
        return operatorcode;
    }

    public void setOperatorcode(String operatorcode) {
        this.operatorcode = operatorcode;
    }

    @Basic
    @Column(name = "INPUTDATE")
    public Time getInputdate() {
        return inputdate;
    }

    public void setInputdate(Time inputdate) {
        this.inputdate = inputdate;
    }

    @Basic
    @Column(name = "INPUTHOUR")
    public Long getInputhour() {
        return inputhour;
    }

    public void setInputhour(Long inputhour) {
        this.inputhour = inputhour;
    }

    @Basic
    @Column(name = "UNDERWRITEENDDATE")
    public Time getUnderwriteenddate() {
        return underwriteenddate;
    }

    public void setUnderwriteenddate(Time underwriteenddate) {
        this.underwriteenddate = underwriteenddate;
    }

    @Basic
    @Column(name = "STATISTICSYM")
    public Time getStatisticsym() {
        return statisticsym;
    }

    public void setStatisticsym(Time statisticsym) {
        this.statisticsym = statisticsym;
    }

    @Basic
    @Column(name = "AGENTCODE")
    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    @Basic
    @Column(name = "COINSFLAG")
    public String getCoinsflag() {
        return coinsflag;
    }

    public void setCoinsflag(String coinsflag) {
        this.coinsflag = coinsflag;
    }

    @Basic
    @Column(name = "REINSFLAG")
    public String getReinsflag() {
        return reinsflag;
    }

    public void setReinsflag(String reinsflag) {
        this.reinsflag = reinsflag;
    }

    @Basic
    @Column(name = "ALLINSFLAG")
    public String getAllinsflag() {
        return allinsflag;
    }

    public void setAllinsflag(String allinsflag) {
        this.allinsflag = allinsflag;
    }

    @Basic
    @Column(name = "UNDERWRITEFLAG")
    public String getUnderwriteflag() {
        return underwriteflag;
    }

    public void setUnderwriteflag(String underwriteflag) {
        this.underwriteflag = underwriteflag;
    }

    @Basic
    @Column(name = "OTHFLAG")
    public String getOthflag() {
        return othflag;
    }

    public void setOthflag(String othflag) {
        this.othflag = othflag;
    }

    @Basic
    @Column(name = "FLAG")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Basic
    @Column(name = "DISRATE1")
    public Long getDisrate1() {
        return disrate1;
    }

    public void setDisrate1(Long disrate1) {
        this.disrate1 = disrate1;
    }

    @Basic
    @Column(name = "BUSINESSFLAG")
    public String getBusinessflag() {
        return businessflag;
    }

    public void setBusinessflag(String businessflag) {
        this.businessflag = businessflag;
    }

    @Basic
    @Column(name = "UPDATERCODE")
    public String getUpdatercode() {
        return updatercode;
    }

    public void setUpdatercode(String updatercode) {
        this.updatercode = updatercode;
    }

    @Basic
    @Column(name = "UPDATEDATE")
    public Time getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Time updatedate) {
        this.updatedate = updatedate;
    }

    @Basic
    @Column(name = "UPDATEHOUR")
    public String getUpdatehour() {
        return updatehour;
    }

    public void setUpdatehour(String updatehour) {
        this.updatehour = updatehour;
    }

    @Basic
    @Column(name = "SIGNDATE")
    public Time getSigndate() {
        return signdate;
    }

    public void setSigndate(Time signdate) {
        this.signdate = signdate;
    }

    @Basic
    @Column(name = "SHAREHOLDERFLAG")
    public String getShareholderflag() {
        return shareholderflag;
    }

    public void setShareholderflag(String shareholderflag) {
        this.shareholderflag = shareholderflag;
    }

    @Basic
    @Column(name = "AGREEMENTNO")
    public String getAgreementno() {
        return agreementno;
    }

    public void setAgreementno(String agreementno) {
        this.agreementno = agreementno;
    }

    @Basic
    @Column(name = "INQUIRYNO")
    public String getInquiryno() {
        return inquiryno;
    }

    public void setInquiryno(String inquiryno) {
        this.inquiryno = inquiryno;
    }

    @Basic
    @Column(name = "PAYMODE")
    public String getPaymode() {
        return paymode;
    }

    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "POLICYNO")
    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    @Basic
    @Column(name = "VISACODE")
    public String getVisacode() {
        return visacode;
    }

    public void setVisacode(String visacode) {
        this.visacode = visacode;
    }

    @Basic
    @Column(name = "MANUALTYPE")
    public String getManualtype() {
        return manualtype;
    }

    public void setManualtype(String manualtype) {
        this.manualtype = manualtype;
    }

    @Basic
    @Column(name = "NATIONFLAG")
    public String getNationflag() {
        return nationflag;
    }

    public void setNationflag(String nationflag) {
        this.nationflag = nationflag;
    }

    @Basic
    @Column(name = "STARTMINUTE")
    public Long getStartminute() {
        return startminute;
    }

    public void setStartminute(Long startminute) {
        this.startminute = startminute;
    }

    @Basic
    @Column(name = "ENDMINUTE")
    public Long getEndminute() {
        return endminute;
    }

    public void setEndminute(Long endminute) {
        this.endminute = endminute;
    }

    @Basic
    @Column(name = "JFEEFLAG")
    public String getJfeeflag() {
        return jfeeflag;
    }

    public void setJfeeflag(String jfeeflag) {
        this.jfeeflag = jfeeflag;
    }

    @Basic
    @Column(name = "PRECHECKDATE")
    public Time getPrecheckdate() {
        return precheckdate;
    }

    public void setPrecheckdate(Time precheckdate) {
        this.precheckdate = precheckdate;
    }

    @Basic
    @Column(name = "HANDLERNAME")
    public String getHandlername() {
        return handlername;
    }

    public void setHandlername(String handlername) {
        this.handlername = handlername;
    }

    @Basic
    @Column(name = "HANDLER1NAME")
    public String getHandler1Name() {
        return handler1Name;
    }

    public void setHandler1Name(String handler1Name) {
        this.handler1Name = handler1Name;
    }

    @Basic
    @Column(name = "PAYREFCODE")
    public String getPayrefcode() {
        return payrefcode;
    }

    public void setPayrefcode(String payrefcode) {
        this.payrefcode = payrefcode;
    }

    @Basic
    @Column(name = "PAYREFNAME")
    public String getPayrefname() {
        return payrefname;
    }

    public void setPayrefname(String payrefname) {
        this.payrefname = payrefname;
    }

    @Basic
    @Column(name = "PAYREFTIME")
    public Time getPayreftime() {
        return payreftime;
    }

    public void setPayreftime(Time payreftime) {
        this.payreftime = payreftime;
    }

    @Basic
    @Column(name = "PRINTTIME")
    public Time getPrinttime() {
        return printtime;
    }

    public void setPrinttime(Time printtime) {
        this.printtime = printtime;
    }

    @Basic
    @Column(name = "AGRITYPE")
    public String getAgritype() {
        return agritype;
    }

    public void setAgritype(String agritype) {
        this.agritype = agritype;
    }

    @Basic
    @Column(name = "SUBBUSINESSNATURE")
    public String getSubbusinessnature() {
        return subbusinessnature;
    }

    public void setSubbusinessnature(String subbusinessnature) {
        this.subbusinessnature = subbusinessnature;
    }

    @Basic
    @Column(name = "AGRINATURE")
    public String getAgrinature() {
        return agrinature;
    }

    public void setAgrinature(String agrinature) {
        this.agrinature = agrinature;
    }

    @Basic
    @Column(name = "SERVICEPROVIDERS")
    public String getServiceproviders() {
        return serviceproviders;
    }

    public void setServiceproviders(String serviceproviders) {
        this.serviceproviders = serviceproviders;
    }

    @Basic
    @Column(name = "SERVICETYPE")
    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }

    @Basic
    @Column(name = "SERVICES")
    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    @Basic
    @Column(name = "BILLINGWAY")
    public String getBillingway() {
        return billingway;
    }

    public void setBillingway(String billingway) {
        this.billingway = billingway;
    }

    @Basic
    @Column(name = "BUSINESSCHANNEL")
    public String getBusinesschannel() {
        return businesschannel;
    }

    public void setBusinesschannel(String businesschannel) {
        this.businesschannel = businesschannel;
    }

    @Basic
    @Column(name = "BUSINESSAGENTTYPE")
    public String getBusinessagenttype() {
        return businessagenttype;
    }

    public void setBusinessagenttype(String businessagenttype) {
        this.businessagenttype = businessagenttype;
    }

    @Basic
    @Column(name = "UNITEAGENTCHANNEL")
    public String getUniteagentchannel() {
        return uniteagentchannel;
    }

    public void setUniteagentchannel(String uniteagentchannel) {
        this.uniteagentchannel = uniteagentchannel;
    }

    @Basic
    @Column(name = "BUSINESSKIND")
    public String getBusinesskind() {
        return businesskind;
    }

    public void setBusinesskind(String businesskind) {
        this.businesskind = businesskind;
    }

    @Basic
    @Column(name = "INVOICEMAN")
    public String getInvoiceman() {
        return invoiceman;
    }

    public void setInvoiceman(String invoiceman) {
        this.invoiceman = invoiceman;
    }

    @Basic
    @Column(name = "CARDCNAME")
    public String getCardcname() {
        return cardcname;
    }

    public void setCardcname(String cardcname) {
        this.cardcname = cardcname;
    }

    @Basic
    @Column(name = "FORMATPOLICYCODE")
    public String getFormatpolicycode() {
        return formatpolicycode;
    }

    public void setFormatpolicycode(String formatpolicycode) {
        this.formatpolicycode = formatpolicycode;
    }

    @Basic
    @Column(name = "JFEEPAYTYPE")
    public String getJfeepaytype() {
        return jfeepaytype;
    }

    public void setJfeepaytype(String jfeepaytype) {
        this.jfeepaytype = jfeepaytype;
    }

    @Basic
    @Column(name = "QUOTATIONNO")
    public String getQuotationno() {
        return quotationno;
    }

    public void setQuotationno(String quotationno) {
        this.quotationno = quotationno;
    }

    @Basic
    @Column(name = "ADDITIONALFLAG")
    public String getAdditionalflag() {
        return additionalflag;
    }

    public void setAdditionalflag(String additionalflag) {
        this.additionalflag = additionalflag;
    }

    @Basic
    @Column(name = "AGENTOPERATEFLAG")
    public String getAgentoperateflag() {
        return agentoperateflag;
    }

    public void setAgentoperateflag(String agentoperateflag) {
        this.agentoperateflag = agentoperateflag;
    }

    @Basic
    @Column(name = "PRINTSTATUS")
    public String getPrintstatus() {
        return printstatus;
    }

    public void setPrintstatus(String printstatus) {
        this.printstatus = printstatus;
    }

    @Basic
    @Column(name = "IFREMOTE")
    public String getIfremote() {
        return ifremote;
    }

    public void setIfremote(String ifremote) {
        this.ifremote = ifremote;
    }

    @Basic
    @Column(name = "IFMEDICAL")
    public String getIfmedical() {
        return ifmedical;
    }

    public void setIfmedical(String ifmedical) {
        this.ifmedical = ifmedical;
    }

    @Basic
    @Column(name = "IFBIDDING")
    public String getIfbidding() {
        return ifbidding;
    }

    public void setIfbidding(String ifbidding) {
        this.ifbidding = ifbidding;
    }

    @Basic
    @Column(name = "IFSPECIALCASE")
    public String getIfspecialcase() {
        return ifspecialcase;
    }

    public void setIfspecialcase(String ifspecialcase) {
        this.ifspecialcase = ifspecialcase;
    }

    @Basic
    @Column(name = "SPECIALCASEDESC")
    public String getSpecialcasedesc() {
        return specialcasedesc;
    }

    public void setSpecialcasedesc(String specialcasedesc) {
        this.specialcasedesc = specialcasedesc;
    }

    @Basic
    @Column(name = "COMPUTERIP")
    public String getComputerip() {
        return computerip;
    }

    public void setComputerip(String computerip) {
        this.computerip = computerip;
    }

    @Basic
    @Column(name = "USBKEY")
    public String getUsbkey() {
        return usbkey;
    }

    public void setUsbkey(String usbkey) {
        this.usbkey = usbkey;
    }

    @Basic
    @Column(name = "POSNO")
    public String getPosno() {
        return posno;
    }

    public void setPosno(String posno) {
        this.posno = posno;
    }

    @Basic
    @Column(name = "APPROVENAME")
    public String getApprovename() {
        return approvename;
    }

    public void setApprovename(String approvename) {
        this.approvename = approvename;
    }

    @Basic
    @Column(name = "APPROVECODE")
    public String getApprovecode() {
        return approvecode;
    }

    public void setApprovecode(String approvecode) {
        this.approvecode = approvecode;
    }

    @Basic
    @Column(name = "IFBLANKET")
    public String getIfblanket() {
        return ifblanket;
    }

    public void setIfblanket(String ifblanket) {
        this.ifblanket = ifblanket;
    }

    @Basic
    @Column(name = "IFENDORSE")
    public String getIfendorse() {
        return ifendorse;
    }

    public void setIfendorse(String ifendorse) {
        this.ifendorse = ifendorse;
    }

    @Basic
    @Column(name = "IFTOTALBLANKET")
    public String getIftotalblanket() {
        return iftotalblanket;
    }

    public void setIftotalblanket(String iftotalblanket) {
        this.iftotalblanket = iftotalblanket;
    }

    @Basic
    @Column(name = "IFREMOTEBLANKET")
    public String getIfremoteblanket() {
        return ifremoteblanket;
    }

    public void setIfremoteblanket(String ifremoteblanket) {
        this.ifremoteblanket = ifremoteblanket;
    }

    @Basic
    @Column(name = "IFREMOTECOINS")
    public String getIfremotecoins() {
        return ifremotecoins;
    }

    public void setIfremotecoins(String ifremotecoins) {
        this.ifremotecoins = ifremotecoins;
    }

    @Basic
    @Column(name = "IFENGAGECOINS")
    public String getIfengagecoins() {
        return ifengagecoins;
    }

    public void setIfengagecoins(String ifengagecoins) {
        this.ifengagecoins = ifengagecoins;
    }

    @Basic
    @Column(name = "IFPACKAGE")
    public String getIfpackage() {
        return ifpackage;
    }

    public void setIfpackage(String ifpackage) {
        this.ifpackage = ifpackage;
    }

    @Basic
    @Column(name = "IFFIRSTPOLICY")
    public String getIffirstpolicy() {
        return iffirstpolicy;
    }

    public void setIffirstpolicy(String iffirstpolicy) {
        this.iffirstpolicy = iffirstpolicy;
    }

    @Basic
    @Column(name = "IFTRADEPAUL")
    public String getIftradepaul() {
        return iftradepaul;
    }

    public void setIftradepaul(String iftradepaul) {
        this.iftradepaul = iftradepaul;
    }

    @Basic
    @Column(name = "BLANKETPOLICYNO")
    public String getBlanketpolicyno() {
        return blanketpolicyno;
    }

    public void setBlanketpolicyno(String blanketpolicyno) {
        this.blanketpolicyno = blanketpolicyno;
    }

    @Basic
    @Column(name = "LESSEENAME")
    public String getLesseename() {
        return lesseename;
    }

    public void setLesseename(String lesseename) {
        this.lesseename = lesseename;
    }

    @Basic
    @Column(name = "LEASECONTRACTNUMBER")
    public String getLeasecontractnumber() {
        return leasecontractnumber;
    }

    public void setLeasecontractnumber(String leasecontractnumber) {
        this.leasecontractnumber = leasecontractnumber;
    }

    @Basic
    @Column(name = "LEASECONTRACTNAME")
    public String getLeasecontractname() {
        return leasecontractname;
    }

    public void setLeasecontractname(String leasecontractname) {
        this.leasecontractname = leasecontractname;
    }

    @Basic
    @Column(name = "WAITTIME")
    public String getWaittime() {
        return waittime;
    }

    public void setWaittime(String waittime) {
        this.waittime = waittime;
    }

    @Basic
    @Column(name = "MAXAMOUNT")
    public Long getMaxamount() {
        return maxamount;
    }

    public void setMaxamount(Long maxamount) {
        this.maxamount = maxamount;
    }

    @Basic
    @Column(name = "MAXSTARTDATE")
    public Time getMaxstartdate() {
        return maxstartdate;
    }

    public void setMaxstartdate(Time maxstartdate) {
        this.maxstartdate = maxstartdate;
    }

    @Basic
    @Column(name = "MAXSTARTHOUR")
    public Long getMaxstarthour() {
        return maxstarthour;
    }

    public void setMaxstarthour(Long maxstarthour) {
        this.maxstarthour = maxstarthour;
    }

    @Basic
    @Column(name = "MAXENDDATE")
    public Time getMaxenddate() {
        return maxenddate;
    }

    public void setMaxenddate(Time maxenddate) {
        this.maxenddate = maxenddate;
    }

    @Basic
    @Column(name = "MAXENDHOUR")
    public Long getMaxendhour() {
        return maxendhour;
    }

    public void setMaxendhour(Long maxendhour) {
        this.maxendhour = maxendhour;
    }

    @Basic
    @Column(name = "FACILITYADDRESS")
    public String getFacilityaddress() {
        return facilityaddress;
    }

    public void setFacilityaddress(String facilityaddress) {
        this.facilityaddress = facilityaddress;
    }

    @Basic
    @Column(name = "FACILITYCODE")
    public String getFacilitycode() {
        return facilitycode;
    }

    public void setFacilitycode(String facilitycode) {
        this.facilitycode = facilitycode;
    }

    @Basic
    @Column(name = "AREACODE")
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    @Basic
    @Column(name = "ANSTALLMENTFLAG")
    public String getAnstallmentflag() {
        return anstallmentflag;
    }

    public void setAnstallmentflag(String anstallmentflag) {
        this.anstallmentflag = anstallmentflag;
    }

    @Basic
    @Column(name = "IFPRPALL")
    public String getIfprpall() {
        return ifprpall;
    }

    public void setIfprpall(String ifprpall) {
        this.ifprpall = ifprpall;
    }

    @Basic
    @Column(name = "IFCENTRALIZED")
    public String getIfcentralized() {
        return ifcentralized;
    }

    public void setIfcentralized(String ifcentralized) {
        this.ifcentralized = ifcentralized;
    }

    @Basic
    @Column(name = "IFBANKPRPALL")
    public String getIfbankprpall() {
        return ifbankprpall;
    }

    public void setIfbankprpall(String ifbankprpall) {
        this.ifbankprpall = ifbankprpall;
    }

    @Basic
    @Column(name = "RECORDDATE")
    public Time getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Time recorddate) {
        this.recorddate = recorddate;
    }

    @Basic
    @Column(name = "BUSINESSTYPEFLAG")
    public String getBusinesstypeflag() {
        return businesstypeflag;
    }

    public void setBusinesstypeflag(String businesstypeflag) {
        this.businesstypeflag = businesstypeflag;
    }

    @Basic
    @Column(name = "SPECIALTYPE")
    public String getSpecialtype() {
        return specialtype;
    }

    public void setSpecialtype(String specialtype) {
        this.specialtype = specialtype;
    }

    @Basic
    @Column(name = "NETTYPE")
    public String getNettype() {
        return nettype;
    }

    public void setNettype(String nettype) {
        this.nettype = nettype;
    }

    @Basic
    @Column(name = "ROADBRANCHCODE")
    public String getRoadbranchcode() {
        return roadbranchcode;
    }

    public void setRoadbranchcode(String roadbranchcode) {
        this.roadbranchcode = roadbranchcode;
    }

    @Basic
    @Column(name = "ROADBRANCHNAME")
    public String getRoadbranchname() {
        return roadbranchname;
    }

    public void setRoadbranchname(String roadbranchname) {
        this.roadbranchname = roadbranchname;
    }

    @Basic
    @Column(name = "EDITTYPE")
    public String getEdittype() {
        return edittype;
    }

    public void setEdittype(String edittype) {
        this.edittype = edittype;
    }

    @Basic
    @Column(name = "RULECHECKSERIALNO")
    public String getRulecheckserialno() {
        return rulecheckserialno;
    }

    public void setRulecheckserialno(String rulecheckserialno) {
        this.rulecheckserialno = rulecheckserialno;
    }

    @Basic
    @Column(name = "REALTIMECLAIMFLAG")
    public String getRealtimeclaimflag() {
        return realtimeclaimflag;
    }

    public void setRealtimeclaimflag(String realtimeclaimflag) {
        this.realtimeclaimflag = realtimeclaimflag;
    }

    @Basic
    @Column(name = "ISNEEDEPOLICY")
    public String getIsneedepolicy() {
        return isneedepolicy;
    }

    public void setIsneedepolicy(String isneedepolicy) {
        this.isneedepolicy = isneedepolicy;
    }

    @Basic
    @Column(name = "ISSENDCLIENT")
    public String getIssendclient() {
        return issendclient;
    }

    public void setIssendclient(String issendclient) {
        this.issendclient = issendclient;
    }

    @Basic
    @Column(name = "STOPDRIVINGDATE")
    public Time getStopdrivingdate() {
        return stopdrivingdate;
    }

    public void setStopdrivingdate(Time stopdrivingdate) {
        this.stopdrivingdate = stopdrivingdate;
    }

    @Basic
    @Column(name = "STOPDRIVINGHOUR")
    public Long getStopdrivinghour() {
        return stopdrivinghour;
    }

    public void setStopdrivinghour(Long stopdrivinghour) {
        this.stopdrivinghour = stopdrivinghour;
    }

    @Basic
    @Column(name = "STARTDRIVINGDATE")
    public Time getStartdrivingdate() {
        return startdrivingdate;
    }

    public void setStartdrivingdate(Time startdrivingdate) {
        this.startdrivingdate = startdrivingdate;
    }

    @Basic
    @Column(name = "STARTDRIVINGHOUR")
    public Long getStartdrivinghour() {
        return startdrivinghour;
    }

    public void setStartdrivinghour(Long startdrivinghour) {
        this.startdrivinghour = startdrivinghour;
    }

    @Basic
    @Column(name = "BUSINESSMODECODE")
    public String getBusinessmodecode() {
        return businessmodecode;
    }

    public void setBusinessmodecode(String businessmodecode) {
        this.businessmodecode = businessmodecode;
    }

    @Basic
    @Column(name = "BUSINESSMODENAME")
    public String getBusinessmodename() {
        return businessmodename;
    }

    public void setBusinessmodename(String businessmodename) {
        this.businessmodename = businessmodename;
    }

    @Basic
    @Column(name = "INSUREDPERIODUNIT")
    public String getInsuredperiodunit() {
        return insuredperiodunit;
    }

    public void setInsuredperiodunit(String insuredperiodunit) {
        this.insuredperiodunit = insuredperiodunit;
    }

    @Basic
    @Column(name = "INSUREDPERIODVALUE")
    public Long getInsuredperiodvalue() {
        return insuredperiodvalue;
    }

    public void setInsuredperiodvalue(Long insuredperiodvalue) {
        this.insuredperiodvalue = insuredperiodvalue;
    }

    @Basic
    @Column(name = "AVGAGE")
    public Long getAvgage() {
        return avgage;
    }

    public void setAvgage(Long avgage) {
        this.avgage = avgage;
    }

    @Basic
    @Column(name = "CARCOVERAGE")
    public String getCarcoverage() {
        return carcoverage;
    }

    public void setCarcoverage(String carcoverage) {
        this.carcoverage = carcoverage;
    }

    @Basic
    @Column(name = "INITIALSTARTDATE")
    public Time getInitialstartdate() {
        return initialstartdate;
    }

    public void setInitialstartdate(Time initialstartdate) {
        this.initialstartdate = initialstartdate;
    }

    @Basic
    @Column(name = "TERMINATIONDATE")
    public Long getTerminationdate() {
        return terminationdate;
    }

    public void setTerminationdate(Long terminationdate) {
        this.terminationdate = terminationdate;
    }

    @Basic
    @Column(name = "ARBITBOARDADDRESS")
    public String getArbitboardaddress() {
        return arbitboardaddress;
    }

    public void setArbitboardaddress(String arbitboardaddress) {
        this.arbitboardaddress = arbitboardaddress;
    }

    @Basic
    @Column(name = "ISSUECODE")
    public String getIssuecode() {
        return issuecode;
    }

    public void setIssuecode(String issuecode) {
        this.issuecode = issuecode;
    }

    @Basic
    @Column(name = "SHORTRATEFLAG")
    public String getShortrateflag() {
        return shortrateflag;
    }

    public void setShortrateflag(String shortrateflag) {
        this.shortrateflag = shortrateflag;
    }

    @Basic
    @Column(name = "ENDORSHORTRATEFLAG")
    public String getEndorshortrateflag() {
        return endorshortrateflag;
    }

    public void setEndorshortrateflag(String endorshortrateflag) {
        this.endorshortrateflag = endorshortrateflag;
    }

    @Basic
    @Column(name = "SHORTRATE")
    public Long getShortrate() {
        return shortrate;
    }

    public void setShortrate(Long shortrate) {
        this.shortrate = shortrate;
    }

    @Basic
    @Column(name = "ENDORSHORTRATE")
    public Long getEndorshortrate() {
        return endorshortrate;
    }

    public void setEndorshortrate(Long endorshortrate) {
        this.endorshortrate = endorshortrate;
    }

    @Basic
    @Column(name = "EXPECTDISCOUNT")
    public Long getExpectdiscount() {
        return expectdiscount;
    }

    public void setExpectdiscount(Long expectdiscount) {
        this.expectdiscount = expectdiscount;
    }

    @Basic
    @Column(name = "SALESNAME")
    public String getSalesname() {
        return salesname;
    }

    public void setSalesname(String salesname) {
        this.salesname = salesname;
    }

    @Basic
    @Column(name = "COMMERCENATURE")
    public String getCommercenature() {
        return commercenature;
    }

    public void setCommercenature(String commercenature) {
        this.commercenature = commercenature;
    }

    @Basic
    @Column(name = "DEDUCTIBLERATE")
    public Long getDeductiblerate() {
        return deductiblerate;
    }

    public void setDeductiblerate(Long deductiblerate) {
        this.deductiblerate = deductiblerate;
    }

    @Basic
    @Column(name = "EXPECTSTURMLIOVILLE")
    public Long getExpectsturmlioville() {
        return expectsturmlioville;
    }

    public void setExpectsturmlioville(Long expectsturmlioville) {
        this.expectsturmlioville = expectsturmlioville;
    }

    @Basic
    @Column(name = "ADDEDTAXFEE")
    public String getAddedtaxfee() {
        return addedtaxfee;
    }

    public void setAddedtaxfee(String addedtaxfee) {
        this.addedtaxfee = addedtaxfee;
    }

    @Basic
    @Column(name = "NOHAVETAXFEE")
    public String getNohavetaxfee() {
        return nohavetaxfee;
    }

    public void setNohavetaxfee(String nohavetaxfee) {
        this.nohavetaxfee = nohavetaxfee;
    }

    @Basic
    @Column(name = "EPOLICYTIME")
    public Time getEpolicytime() {
        return epolicytime;
    }

    public void setEpolicytime(Time epolicytime) {
        this.epolicytime = epolicytime;
    }

    @Basic
    @Column(name = "ISSUECODEUPDATEDATE")
    public String getIssuecodeupdatedate() {
        return issuecodeupdatedate;
    }

    public void setIssuecodeupdatedate(String issuecodeupdatedate) {
        this.issuecodeupdatedate = issuecodeupdatedate;
    }

    @Basic
    @Column(name = "MAKEINVOICE")
    public String getMakeinvoice() {
        return makeinvoice;
    }

    public void setMakeinvoice(String makeinvoice) {
        this.makeinvoice = makeinvoice;
    }

    @Basic
    @Column(name = "AGREEMENTDATE")
    public String getAgreementdate() {
        return agreementdate;
    }

    public void setAgreementdate(String agreementdate) {
        this.agreementdate = agreementdate;
    }

    @Basic
    @Column(name = "FACILITATORCODE")
    public String getFacilitatorcode() {
        return facilitatorcode;
    }

    public void setFacilitatorcode(String facilitatorcode) {
        this.facilitatorcode = facilitatorcode;
    }

    @Basic
    @Column(name = "QUOTE_NO")
    public String getQuoteNo() {
        return quoteNo;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }

    @Basic
    @Column(name = "FOLLOWDATE")
    public String getFollowdate() {
        return followdate;
    }

    public void setFollowdate(String followdate) {
        this.followdate = followdate;
    }

    @Basic
    @Column(name = "CREDITCONTRACTNO")
    public String getCreditcontractno() {
        return creditcontractno;
    }

    public void setCreditcontractno(String creditcontractno) {
        this.creditcontractno = creditcontractno;
    }

    @Basic
    @Column(name = "ISNEEDEPROPOSAL")
    public String getIsneedeproposal() {
        return isneedeproposal;
    }

    public void setIsneedeproposal(String isneedeproposal) {
        this.isneedeproposal = isneedeproposal;
    }

    @Basic
    @Column(name = "CONTRACTSTATUS")
    public String getContractstatus() {
        return contractstatus;
    }

    public void setContractstatus(String contractstatus) {
        this.contractstatus = contractstatus;
    }

    @Basic
    @Column(name = "PAYTIMESPG")
    public Long getPaytimespg() {
        return paytimespg;
    }

    public void setPaytimespg(Long paytimespg) {
        this.paytimespg = paytimespg;
    }

    @Basic
    @Column(name = "VAIDCODE")
    public String getVaidcode() {
        return vaidcode;
    }

    public void setVaidcode(String vaidcode) {
        this.vaidcode = vaidcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrptmainEntity that = (PrptmainEntity) o;
        return Objects.equals(proposalno, that.proposalno) &&
                Objects.equals(classcode, that.classcode) &&
                Objects.equals(riskcode, that.riskcode) &&
                Objects.equals(contractno, that.contractno) &&
                Objects.equals(policysort, that.policysort) &&
                Objects.equals(printno, that.printno) &&
                Objects.equals(businessnature, that.businessnature) &&
                Objects.equals(language, that.language) &&
                Objects.equals(policytype, that.policytype) &&
                Objects.equals(applicode, that.applicode) &&
                Objects.equals(appliname, that.appliname) &&
                Objects.equals(appliaddress, that.appliaddress) &&
                Objects.equals(insuredcode, that.insuredcode) &&
                Objects.equals(insuredname, that.insuredname) &&
                Objects.equals(insuredaddress, that.insuredaddress) &&
                Objects.equals(operatedate, that.operatedate) &&
                Objects.equals(startdate, that.startdate) &&
                Objects.equals(starthour, that.starthour) &&
                Objects.equals(enddate, that.enddate) &&
                Objects.equals(endhour, that.endhour) &&
                Objects.equals(purerate, that.purerate) &&
                Objects.equals(disrate, that.disrate) &&
                Objects.equals(discount, that.discount) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(sumvalue, that.sumvalue) &&
                Objects.equals(sumamount, that.sumamount) &&
                Objects.equals(sumdiscount, that.sumdiscount) &&
                Objects.equals(sumpremium, that.sumpremium) &&
                Objects.equals(sumsubprem, that.sumsubprem) &&
                Objects.equals(sumquantity, that.sumquantity) &&
                Objects.equals(judicalcode, that.judicalcode) &&
                Objects.equals(judicalscope, that.judicalscope) &&
                Objects.equals(autotransrenewflag, that.autotransrenewflag) &&
                Objects.equals(arguesolution, that.arguesolution) &&
                Objects.equals(arbitboardname, that.arbitboardname) &&
                Objects.equals(paytimes, that.paytimes) &&
                Objects.equals(endorsetimes, that.endorsetimes) &&
                Objects.equals(claimtimes, that.claimtimes) &&
                Objects.equals(makecom, that.makecom) &&
                Objects.equals(operatesite, that.operatesite) &&
                Objects.equals(comcode, that.comcode) &&
                Objects.equals(handlercode, that.handlercode) &&
                Objects.equals(handler1Code, that.handler1Code) &&
                Objects.equals(approvercode, that.approvercode) &&
                Objects.equals(underwritecode, that.underwritecode) &&
                Objects.equals(underwritename, that.underwritename) &&
                Objects.equals(operatorcode, that.operatorcode) &&
                Objects.equals(inputdate, that.inputdate) &&
                Objects.equals(inputhour, that.inputhour) &&
                Objects.equals(underwriteenddate, that.underwriteenddate) &&
                Objects.equals(statisticsym, that.statisticsym) &&
                Objects.equals(agentcode, that.agentcode) &&
                Objects.equals(coinsflag, that.coinsflag) &&
                Objects.equals(reinsflag, that.reinsflag) &&
                Objects.equals(allinsflag, that.allinsflag) &&
                Objects.equals(underwriteflag, that.underwriteflag) &&
                Objects.equals(othflag, that.othflag) &&
                Objects.equals(flag, that.flag) &&
                Objects.equals(disrate1, that.disrate1) &&
                Objects.equals(businessflag, that.businessflag) &&
                Objects.equals(updatercode, that.updatercode) &&
                Objects.equals(updatedate, that.updatedate) &&
                Objects.equals(updatehour, that.updatehour) &&
                Objects.equals(signdate, that.signdate) &&
                Objects.equals(shareholderflag, that.shareholderflag) &&
                Objects.equals(agreementno, that.agreementno) &&
                Objects.equals(inquiryno, that.inquiryno) &&
                Objects.equals(paymode, that.paymode) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(policyno, that.policyno) &&
                Objects.equals(visacode, that.visacode) &&
                Objects.equals(manualtype, that.manualtype) &&
                Objects.equals(nationflag, that.nationflag) &&
                Objects.equals(startminute, that.startminute) &&
                Objects.equals(endminute, that.endminute) &&
                Objects.equals(jfeeflag, that.jfeeflag) &&
                Objects.equals(precheckdate, that.precheckdate) &&
                Objects.equals(handlername, that.handlername) &&
                Objects.equals(handler1Name, that.handler1Name) &&
                Objects.equals(payrefcode, that.payrefcode) &&
                Objects.equals(payrefname, that.payrefname) &&
                Objects.equals(payreftime, that.payreftime) &&
                Objects.equals(printtime, that.printtime) &&
                Objects.equals(agritype, that.agritype) &&
                Objects.equals(subbusinessnature, that.subbusinessnature) &&
                Objects.equals(agrinature, that.agrinature) &&
                Objects.equals(serviceproviders, that.serviceproviders) &&
                Objects.equals(servicetype, that.servicetype) &&
                Objects.equals(services, that.services) &&
                Objects.equals(billingway, that.billingway) &&
                Objects.equals(businesschannel, that.businesschannel) &&
                Objects.equals(businessagenttype, that.businessagenttype) &&
                Objects.equals(uniteagentchannel, that.uniteagentchannel) &&
                Objects.equals(businesskind, that.businesskind) &&
                Objects.equals(invoiceman, that.invoiceman) &&
                Objects.equals(cardcname, that.cardcname) &&
                Objects.equals(formatpolicycode, that.formatpolicycode) &&
                Objects.equals(jfeepaytype, that.jfeepaytype) &&
                Objects.equals(quotationno, that.quotationno) &&
                Objects.equals(additionalflag, that.additionalflag) &&
                Objects.equals(agentoperateflag, that.agentoperateflag) &&
                Objects.equals(printstatus, that.printstatus) &&
                Objects.equals(ifremote, that.ifremote) &&
                Objects.equals(ifmedical, that.ifmedical) &&
                Objects.equals(ifbidding, that.ifbidding) &&
                Objects.equals(ifspecialcase, that.ifspecialcase) &&
                Objects.equals(specialcasedesc, that.specialcasedesc) &&
                Objects.equals(computerip, that.computerip) &&
                Objects.equals(usbkey, that.usbkey) &&
                Objects.equals(posno, that.posno) &&
                Objects.equals(approvename, that.approvename) &&
                Objects.equals(approvecode, that.approvecode) &&
                Objects.equals(ifblanket, that.ifblanket) &&
                Objects.equals(ifendorse, that.ifendorse) &&
                Objects.equals(iftotalblanket, that.iftotalblanket) &&
                Objects.equals(ifremoteblanket, that.ifremoteblanket) &&
                Objects.equals(ifremotecoins, that.ifremotecoins) &&
                Objects.equals(ifengagecoins, that.ifengagecoins) &&
                Objects.equals(ifpackage, that.ifpackage) &&
                Objects.equals(iffirstpolicy, that.iffirstpolicy) &&
                Objects.equals(iftradepaul, that.iftradepaul) &&
                Objects.equals(blanketpolicyno, that.blanketpolicyno) &&
                Objects.equals(lesseename, that.lesseename) &&
                Objects.equals(leasecontractnumber, that.leasecontractnumber) &&
                Objects.equals(leasecontractname, that.leasecontractname) &&
                Objects.equals(waittime, that.waittime) &&
                Objects.equals(maxamount, that.maxamount) &&
                Objects.equals(maxstartdate, that.maxstartdate) &&
                Objects.equals(maxstarthour, that.maxstarthour) &&
                Objects.equals(maxenddate, that.maxenddate) &&
                Objects.equals(maxendhour, that.maxendhour) &&
                Objects.equals(facilityaddress, that.facilityaddress) &&
                Objects.equals(facilitycode, that.facilitycode) &&
                Objects.equals(areacode, that.areacode) &&
                Objects.equals(anstallmentflag, that.anstallmentflag) &&
                Objects.equals(ifprpall, that.ifprpall) &&
                Objects.equals(ifcentralized, that.ifcentralized) &&
                Objects.equals(ifbankprpall, that.ifbankprpall) &&
                Objects.equals(recorddate, that.recorddate) &&
                Objects.equals(businesstypeflag, that.businesstypeflag) &&
                Objects.equals(specialtype, that.specialtype) &&
                Objects.equals(nettype, that.nettype) &&
                Objects.equals(roadbranchcode, that.roadbranchcode) &&
                Objects.equals(roadbranchname, that.roadbranchname) &&
                Objects.equals(edittype, that.edittype) &&
                Objects.equals(rulecheckserialno, that.rulecheckserialno) &&
                Objects.equals(realtimeclaimflag, that.realtimeclaimflag) &&
                Objects.equals(isneedepolicy, that.isneedepolicy) &&
                Objects.equals(issendclient, that.issendclient) &&
                Objects.equals(stopdrivingdate, that.stopdrivingdate) &&
                Objects.equals(stopdrivinghour, that.stopdrivinghour) &&
                Objects.equals(startdrivingdate, that.startdrivingdate) &&
                Objects.equals(startdrivinghour, that.startdrivinghour) &&
                Objects.equals(businessmodecode, that.businessmodecode) &&
                Objects.equals(businessmodename, that.businessmodename) &&
                Objects.equals(insuredperiodunit, that.insuredperiodunit) &&
                Objects.equals(insuredperiodvalue, that.insuredperiodvalue) &&
                Objects.equals(avgage, that.avgage) &&
                Objects.equals(carcoverage, that.carcoverage) &&
                Objects.equals(initialstartdate, that.initialstartdate) &&
                Objects.equals(terminationdate, that.terminationdate) &&
                Objects.equals(arbitboardaddress, that.arbitboardaddress) &&
                Objects.equals(issuecode, that.issuecode) &&
                Objects.equals(shortrateflag, that.shortrateflag) &&
                Objects.equals(endorshortrateflag, that.endorshortrateflag) &&
                Objects.equals(shortrate, that.shortrate) &&
                Objects.equals(endorshortrate, that.endorshortrate) &&
                Objects.equals(expectdiscount, that.expectdiscount) &&
                Objects.equals(salesname, that.salesname) &&
                Objects.equals(commercenature, that.commercenature) &&
                Objects.equals(deductiblerate, that.deductiblerate) &&
                Objects.equals(expectsturmlioville, that.expectsturmlioville) &&
                Objects.equals(addedtaxfee, that.addedtaxfee) &&
                Objects.equals(nohavetaxfee, that.nohavetaxfee) &&
                Objects.equals(epolicytime, that.epolicytime) &&
                Objects.equals(issuecodeupdatedate, that.issuecodeupdatedate) &&
                Objects.equals(makeinvoice, that.makeinvoice) &&
                Objects.equals(agreementdate, that.agreementdate) &&
                Objects.equals(facilitatorcode, that.facilitatorcode) &&
                Objects.equals(quoteNo, that.quoteNo) &&
                Objects.equals(followdate, that.followdate) &&
                Objects.equals(creditcontractno, that.creditcontractno) &&
                Objects.equals(isneedeproposal, that.isneedeproposal) &&
                Objects.equals(contractstatus, that.contractstatus) &&
                Objects.equals(paytimespg, that.paytimespg) &&
                Objects.equals(vaidcode, that.vaidcode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(proposalno, classcode, riskcode, contractno, policysort, printno, businessnature, language, policytype, applicode, appliname, appliaddress, insuredcode, insuredname, insuredaddress, operatedate, startdate, starthour, enddate, endhour, purerate, disrate, discount, currency, sumvalue, sumamount, sumdiscount, sumpremium, sumsubprem, sumquantity, judicalcode, judicalscope, autotransrenewflag, arguesolution, arbitboardname, paytimes, endorsetimes, claimtimes, makecom, operatesite, comcode, handlercode, handler1Code, approvercode, underwritecode, underwritename, operatorcode, inputdate, inputhour, underwriteenddate, statisticsym, agentcode, coinsflag, reinsflag, allinsflag, underwriteflag, othflag, flag, disrate1, businessflag, updatercode, updatedate, updatehour, signdate, shareholderflag, agreementno, inquiryno, paymode, remark, policyno, visacode, manualtype, nationflag, startminute, endminute, jfeeflag, precheckdate, handlername, handler1Name, payrefcode, payrefname, payreftime, printtime, agritype, subbusinessnature, agrinature, serviceproviders, servicetype, services, billingway, businesschannel, businessagenttype, uniteagentchannel, businesskind, invoiceman, cardcname, formatpolicycode, jfeepaytype, quotationno, additionalflag, agentoperateflag, printstatus, ifremote, ifmedical, ifbidding, ifspecialcase, specialcasedesc, computerip, usbkey, posno, approvename, approvecode, ifblanket, ifendorse, iftotalblanket, ifremoteblanket, ifremotecoins, ifengagecoins, ifpackage, iffirstpolicy, iftradepaul, blanketpolicyno, lesseename, leasecontractnumber, leasecontractname, waittime, maxamount, maxstartdate, maxstarthour, maxenddate, maxendhour, facilityaddress, facilitycode, areacode, anstallmentflag, ifprpall, ifcentralized, ifbankprpall, recorddate, businesstypeflag, specialtype, nettype, roadbranchcode, roadbranchname, edittype, rulecheckserialno, realtimeclaimflag, isneedepolicy, issendclient, stopdrivingdate, stopdrivinghour, startdrivingdate, startdrivinghour, businessmodecode, businessmodename, insuredperiodunit, insuredperiodvalue, avgage, carcoverage, initialstartdate, terminationdate, arbitboardaddress, issuecode, shortrateflag, endorshortrateflag, shortrate, endorshortrate, expectdiscount, salesname, commercenature, deductiblerate, expectsturmlioville, addedtaxfee, nohavetaxfee, epolicytime, issuecodeupdatedate, makeinvoice, agreementdate, facilitatorcode, quoteNo, followdate, creditcontractno, isneedeproposal, contractstatus, paytimespg, vaidcode);
    }
}
