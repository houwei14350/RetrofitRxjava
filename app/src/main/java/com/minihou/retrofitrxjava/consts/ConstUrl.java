package com.minihou.retrofitrxjava.consts;

/**
 * 项 目 名 AndroidEcLite43.
 * 描    述 存放请求Url的类
 * 创 建 人 Tony
 * 创建时间 2016 11 11.
 * Copyright (c) 六度人和公司-版权所有
 */
public class ConstUrl {
    public static final String LITE_WORKEC_COM="https://lite.workec.com";

    public static final String ADD_LOG_URL = "/api/crm/addlog";//添加拨打电话轨迹 添加记录的上传

    public static final String GET_TABLE_NUMS_URL = "/api/newcrm/getablenums";//获取目前上限还剩余客户数

    public static final String LIST_CRM_URL = "/api/newcrm/listcrm";//获取共享客户变更  使用http拉取客户列表

    public static final String GET_FRIEND_URL = "/api/user/getfriend";//获取Ec好友数据

    public static final String STRU_URL = "/api/corp/stru";//拉取数据

    public static final String SUBUSERS_URL = "/api/job/subusers";//

    public static final String GET_UNSEND_URL = "/api/weixin/getunsend"; //获取微信分享未读个数

    public static final String LOG_URL = "/api/contact/log";

    public static final String LIST_MY_URL = "/api/visit/listmy";//拉取签到列表变更

    public static final String ADD_PLAN_URL = "/api/plannew/addplan";//创建销售计划

    public static final String PC_KEY_URL = "/aliyun/pckey";

    public static final String BROADCAST_URL = "/broadcast";//验证广播是否删除

    public static final String GET_NUM_URL = "/api/broadcast/getnum";//获取广播个数

    public static final String BROADCAST_LIST_URL = "/broadcast/list";//拉取广播

    public static final String TELSEARCH_URL = "/api/crm/telsearch";//电话总机查询

    public static final String SEARCH_WX_URL = "/api/crm/searchwx";//微信领取

    public static final String CHECK_DATE_URL = "/api/newcrm/checkdate";//客户列表超时接口

    public static final String GET_STEPS_URL = "/api/newcrm/getsteps";// 拉取客户跟进状态分组

    public static final String MDF_STEP_URL = "/api/newcrm/mdfstep";//拉取客户跟进状态分组

    public static final String GET_GROUP_URL = "/api/crm/getgroup";

    public static final String GET_WEIXIN_URL = "/api/crm/getweixin";//微信客户列表

    public static final String MOBILE_URL = "/api/crm/mobile";//根据手机号码获取用户详细资料

    public static final String GET_INFO_URL = "/api/crm/getinfo";//拉取客户详情

    public static final String LOG_LIST_URL = "/api/log/list";//拉取用户轨迹

    public static final String TAG_URL = "/api/change/tag";//使用http拉取全量标签列表

    public static final String CHANGE_SETTING_URL = "/api/change/settag";//批量更新标签

    public static final String ADD_MEMBER_URL = "/discuss/addmember";//拉人进群或者讨论组

    public static final String CREATE_DIS_URL = "/discuss/createdis";//创建群或者讨论组

    public static final String GET_COMMENTS_URL = "/api/job/getcomments";//获取未读日报个数

    public static final String MYCOMMENTS_URL = "/api/job/mycomments";//获取我的的评论列表

    public static final String GIVEUP_CRM_URL = "/api/crm/giveupcrm";//放弃客户

    public static final String GIVEUP_SHARE_URL = "/api/crm/giveupshare";//移除共享给我的客户

    public static final String DELCRM_URL = "/api/newcrm/delcrm";//删除客户

    public static final String CHANGECRM_URL = "/api/newcrm/changecrm";//转让客户

    public static final String SINGLEDIS_URL = "/discuss/singledis";//拉取讨论组基本信息

    public static final String DIS_MEMBER_URL = "/discuss/dismemberurl";//拉取讨论组成员列表

    public static final String SET_PUSH_URL = "/discuss/setpush";//设置讨论组的消息推送

    public static final String QUIT_DIS_URL = "/discuss/quitdis";//退出讨论组

    public static final String MOFIFY_DISNAME = "/discuss/mofifydisname";//修改讨论组名字

    public static final String GET_CONFIG_URL = "/api/auth/getconfig";

    public static final String SET_CONFIG_URL = "/api/auth/setconfig";

    public static final String GET_FRIEND_INFO = "/api/user/getfriendinfo";//拉取用户轨迹

    public static final String GET_CODE_URL = "/api/comm/getcode";//获取验证码

    public static final String REGISTER_INDEX_URL = "/api/register/index";// 注册账号

    public static final String CHKCODE_URL = "/api/comm/chkcode";//验证验证码

    public static final String FINDPWD_URL = "/api/comm/findpwd";//忘记密码

    public static final String SAVEINFO_URL = "/api/user/saveinfo";//SAVEINFO_URL

    public static final String CORP_MEMBER = "/api/corp/member";//拉取用户轨迹

    public static final String LIST_SHARE_URL = "/api/form/listmsg";//拉取H5消息列表

    public static final String SHARE_COUNT_URL = "/api/form/sharecount";//微信 、朋友圈 分享次数

    public static final String FORM_DETAIL_URL = "/api/form/detail";//H5详情

    public static final String ALIYUN_KEY_URL = "/aliyun/key";

    public static final String GET_USER_INFO = "/api/user/getuserinfo";

    public static final String GET_CHANGE_URL = "/api/change/getchange";// 变更数据拉取

    public static final String GET_QQ_CRMS = "/api/qq/getqqcrms";////拉取当前qq绑定的QQ好友的crmid列表

    public static final String GET_PLAN_SIGN = "/api/plannew/getplansign";//获取签名

    public static final String SAVE_CRM_URL = "/api/newcrm/savecrm";//上传客户的修改的信息 wyt 添加

    public static final String GET_FIELD_URL = "/api/newcrm/getfield";//获取自定义字段

    public static final String ADD_CRM_URL = "/api/newcrm/addcrm";//创建客户

    public static final String V2_BATCH_GROUP_URL = "/v2/group/batchgroup";

    public static final String V2_DISCUSS_BATCHDIS_URL = "/v2/discuss/batchdis";

    public static final String BATCH_GROUP_URL = "/group/batchgroup"; //拉取全部群。

    public static final String DISCUSS_BATCHDIS = "/discuss/batchdis"; //拉取全部讨论组（分批）

    public static final String GET_LAST_MSG = "/api/change/getlastmsg";

    public static final String GET_MAIL_PWD = "/api/mail/getmailpwd";

    public static final String CHECK_GUID = "/api/crm/checkguid";

    public static final String CRM_WEIXINMNG = "/api/crm/weixinmng";//微信客户领取

    public static final String AUTH_SET_CONFIG = "/api/auth/setconfig";//设置是接受工作提醒

    public static final String AUTH_GET_CONFIG = "/api/auth/getconfig";//接受工作提醒

    public static final String GROUP_SINGLE_GROUP = "/group/singlegroup";//拉取群组基本信息

    public static final String GROUP_GROUP_MEMBER_URL = "/group/groupmemberurlnew";//拉取群成员列表

    public static final String GROUP_SET_PUSH_URL = "/group/setpush";// 设置群的消息推送

    public static final String GROUP_QUIT_GROUP_URL = "/group/quitgroup";//退出群

    public static final String GROUP_MOFIFY_GROUP_NAME_URL = "/group/mofifygroupname";//修改群名字

    public static final String LOGIN_CHECK_URL = "/login/check";//

    public static final String USER_GETINFO_URL = "/api/user/getinfo";//获取个人资料

    //public static final String MSG_LIST_URL = "/msg/list";//离线消息列表
    public static final String MSG_LIST_URL = "/v2/msg/list";//离线消息列表

    public static final String MSG_CONTENT_URL = "/msg/content";//利息消息内容

    public static final String MSG_VISIT_URL = "/msg/visit";//访客消息

    public static final String VISITOR_INFO_URL = "/visitor/info";//访客在线列表

    public static final String VISITOR_OFF__INFO_URL = "/visitor/offinfo";//访客离线列表

    public static final String VISITOR_STATUS_URL = "/visitor/status";//访客状态

    public static final String VISITOR_REPLY_URL = "/visitor/reply";

    public static final String VISIT_GET_TAG_URL = "/api/visit/gettag";//获取拜访事件列表

    public static final String VISIT_ADD_VISIT_URL = "/api/visit/addvisit";

    public static final String VISIT_OUT_VISIT_URL = "/api/visit/outvisit";

    public static final String WORK_TELLIST_URL = "/api/work/tellist";

    public static final String SMS_UNSEND_URL = "/api/sms/unsend";

    public static final String CRM_MOBILES_URL = "/api/crm/mobiles";//通过电话组获取相应姓名

    public static final String SMS_GETFILE_URL = "/api/sms/getfile";// 获取群发短信

    public static final String SMS_DEL_URL = "/api/sms/del";

    public static final String AUTH_FUNC_URL = "/api/auth/func";

    public static final String CORP_MEMBER_URL = "/api/corp/member?userid=";//拉取企业成员详情

    public static final String USER_GET_FRIEND_INFO = "/api/user/getfriendinfo/?id=";//获取单个好友信息

    public static final String REMIND_GET_LIST_URL = "/api/remind/getlist";//拉取销售计划列表

    public static final String PLANNEW_GET_LISTWEEK = "/api/plannew/getlistweek";//拉取销售计划列表

    public static final String REMIND_GET_PLANS = "/api/remind/getplans";//新企业进入详情/群发列表 拉取详细信息

    public static final String REMIND_ADD_URL = "/api/remind/add";//新建销售计划

    public static final String REMIND_DELALL_URL = "/api/remind/delall/";//删除销售计划批次

    public static final String PLAN_NEW_WANTDEL_URL = "/api/plannew/wantdel/";//删除销售计划批次

    public static final String REMIND_DEL_URL = "/api/remind/del/";//删除销售计划单条

    public static final String PLAN_WANTDEL_URL = "/api/plan/wantdel/";//删除销售计划单条

    public static final String REMIND_SET_STATE = "/api/remind/setstate/";//设置除微信与提醒以外的计划的状态 (新企业)

    public static final String REMIND_SET_ALL_STATE = "/api/remind/setallstate/";//设置计划批次的状态

    public static final String UPDATE_USER_INFO = "/update/userinfo";

    public static final String AUTH_QBIND = "/api/auth/qbind";//// qq绑定

    public static final String AUTH_QUNBIND_URL = "/api/auth/qunbind";// qq解绑

    public static final String QQ_GROUPS_URL = "/api/qq/groups";//拉取QQ好友组信息

    public static final String QQ_FRIENDS_URL = "/api/qq/friends";//拉取QQ好友信息

    public static final String CONTACT_LIST_URL = "/api/contact/list";//获取列表数据

    public static final String NEWCRM_SENDSHARE_URL = "/api/newcrm/sendshare";//请求共享

    public static final String NEWCRM_GET_PUBLIC_URL = "/api/newcrm/getpublic";//领取

    public static final String JOB_LIST_URL = "/api/job/list";// 拉取下属销售日报列表

    public static final String JOB_UP_NEW_URL = "/api/job/upnew";//创建日报

    public static final String JOB_DETAIL_NEW_URL = "/api/job/detailnew";// 获取日报详情

    public static final String JOB_GET_NUMS_URL = "/api/job/getnums";//获取工作记录

    public static final String JOB_COMMENT_URL = "/api/job/comment";//创建日报评论

    public static final String JOB_JOBCOMMENTS_UTIL = "/api/job/jobcomments";// 获取日报评论

    public static final String WORK_JOB_DATAS = "/api/work/jobdatas";

    public static final String JOB_JOB_DATAS_URL = "/api/job/jobdatas";//日报界面的详细数据

    public static final String MODEL_GET_GROUP_URL = "/api/model/getgroup";//全量拉取销售模板分组

    public static final String MODEL_GET_LIST_URL = "/api/model/getlist";// 获取销售模板数据

    public static final String FILE_LIST_NEW_URL = "/api/file/listnew";

    public static final String NEWCRM_LISTSHARE_URL = "/api/newcrm/listshare";//拉取共享请求列表

    public static final String NEW_CRM_DOSHARE = "/api/newcrm/doshare";

    public static final String NEW_CRM_CHECKSHARE_URL = "/api/newcrm/checkshare";//请求共享关系

    public static final String NEW_CRM_ADD_SHARE_URL = "/api/newcrm/addshare";//上报共享关系

    public static final String NEW_CRM_GET_STEPS_URL = "/api/newcrm/getsteps";//获得客户阶段

    public static final String CHANGE_TAG_URL = "/api/change/tag";//获得标签

    public static final String CRM_LIST_WORK_URL = "/api/crmlist/work";//团队客户数据

    public static final String WORK_JOB_LIST_URL = "/api/work/joblist";//获取团队工作管理列表

    public static final String WORK_JOB_DETAIL_URL = "/api/work/jobdetail";//获取团队工作管理详情的 拜访签到列表和通话列表

    public static final String VISIT_LIST_URL = "/api/visit/list";//通过http请求获取下属签到列表

    public static final String USER_UPFACE_URL = "/api/user/upface";//个人头像上传

    public static final String FEEDBACK_UPLOAD_URL = "/feedback/upload";

    public static final String KEY_INDEX_URL = "/api/key/index";//验证webView的Key是否过期

    public static final String VERSION_URL = "/api/version";//获取版本信息

    public static final String VISITOR_SCHEME_URL = "/visitor/scheme";// 获取客服套数

    public static final String WEIXIN_GET_SHARE_URL = "/api/weixin/getshare";

    public static final String WORK_RANK_LIST_URL = "/api/work/ranklist";//工作效率统计

    public static final String WEIXIN_SET_STATE_URL = "/api/weixin/setstate";//微信分享状态设置

    public static final String CHANGE_GET_YUN_TELS = "/api/change/getyuntels";//EC云呼获取数据

    public static final String SERVICE_PSTN_CALLBACK_URL = "service/pstn/callback";//抛出一次拨打

    public static final String SERVICE_PASTN_CALL_CANCEL_URL = "service/pstn/callcancel";//抛出取消拨打

    public static final String PLAN_SET_MAIL_STATE_URL = "/api/plan/setmailstate";

    public static final String PLAN_NEW_SET_STATE_URL = "/api/plannew/setstate";

    public static final String USER_SAVE_PASSWORD_URL = "/api/user/savepassword";//修改密码

    public static final String WEIXIN_SETTOP_URL = "/api/weixin/settop";//微信置顶


    public static final String SALES_STATISTICS_DEPT_URL = "/api/sale/group"; // 获取销售部门金额数据

    public static final String SALES_STATISTICS_VIEW_URL = "/api/sale/view"; // 获取员工销售金额数据

    public static final String SALES_STATISTICS_DETAIL_URL = "/api/sale/detail"; // 获取项目销售金额数据

    public static final String YUN_ZONG_JI_URL = "/api/tel/cloudcall";//云总机

    public static final String YUN_ZONG_JI_URL_CANCEL = "/api/tel/cloudcancel";//云总机拨打取消

    public static final String GET_RECEENT_MSG = "/api/change/getlastmsg"; // 获取最新信息

    public static final String MODIFY_GROUP_ANNOU = "/group/mofifygroupad";//更改群公告

    public static final String GET_GROUP_FILE = "/api/file/groupfile"; // 获取群组文件

    public static final String GET_SMS_SIGN = "/api/sms/listsign";//获取短信签名

    public static final String ADD_STAFF_URL = "/api/employee/adduser"; //添加员工

    public static final String TEAM_MSG_LIST = "/api/msg/list"; // 团队消息列表

    public static final String GET_CUSTOMER_FROM = "/api/change/getchannel";//客户来源

    public static final String APPLY_GROUP_SPACE = "/api/group/applyspace";//申请上传群文件空间

    public static final String POST_GROUP_FILE = "/api/group/savepcfile";//上报群文件记录

    public static final String NEAR_CLIENT = "/api/newcrm/getnearcrms";//附近客户

    public static final String CS_SHORTCUT = "/v3/cs/quickreply/gethotlist";//获取TIM签名

    public static final String COLLECT_LIST = "/api/collect/getlist";//获取收藏列表

    public static final String TIM_GETSIGN = "/tencentsign/getsign";//获取TIM签名

    public static final String CS_RECENT = "/v3/cs/index/getlist"; // 最近联系的访客列表

    public static final String COLLECT_MESSAGE = "/api/collect/add";//收藏消息

    public static final String VISITOR_INFO = "/v3/cs/index/getinfo";//获取访客信息

    public static final String SALE_MONEY_INFO = "/api/sale/detail";//获取销售金额详情或者新建配置

    public static final String SAVE_UPDATE_SALE_MONEY_INFO = "/api/sale/save";//修改和新建保存销售金额数据

    public static final String GET_SALE_MONEY_LIST = "/api/sale/list";//获取销售金额列表

    public static final String MODIFY_SALE_MONEY_STATUS = "/api/sale/changestatus";//修改销售金额状态

    public static final String CANCEL_COLLECT = "/api/collect/del";//取消收藏

    public static final String EXAMINE_MSG_LIST = "/oa/msgs";//获取审批消息列表

    public static final String OFF_RESOURCE_VERSION = "/service/webrsrc/getversion";//获取离线资源版本

    public static final String OFF_RESOURCE_CONF = "/service/webrsrc/getconfig";//获取离线资源配置

    public static final String CRM_MESSAGE_LIST = "/api/msg/crmlist";//crm消息列表

    public static final String IS_SHOW_REGISTER = "/login/getfunc";//是否显示注册按钮

    public static final String GET_XXTEA_URL = "/api/comm/getkey";//获取加密key和时间戳

    public static final String GET_VERIFICATION_CODE = "/api/comm/getsmscode";//请求发送验证码

    public static final String VERIFICATION_CODE = "/api/comm/checksmscode";//验证短信

    public static final String FIND_PWD = "/api/comm/findapppwd";//找回密码

    public static final String GET_INDUSTRYANDADDRESS = "/api/comm/getvocationandarea"; //获取地址和行业数据

    public static final String REQUEST_REGISTER = "/api/comm/register"; //获取地址和行业数据

    public static final String LAUNCHER_IMG = "/v3/base/config/getstartimg"; //启动图

    public static final String REQUEST_INDUSTRAY = "/v3/base/config/getareavocation";//获取行业和地区的json 字符串

    public static final String REQUEST_CLIENT_INFO = "/v3/crm/info/show";

    public static final String CREATE_CUSTOMER_INFO = "/v3/crm/info/add"; //创建客户资料

    public static final String EDIT_CUSTOMER_INFO = "/v3/crm/info/save";//修改客户资料

    public static final String GET_NEW_VERSION_URL = "/login/getupurl";//获取ec最新版本的下载链接

    //Server统一登录服务https://lite.workec.com/v1/loginverify/login
    public static final String LOGIN_SERVER = "/v1/loginverify/login";

    //TIM特殊消息
    public static final String MOBILEAPI_GETSPECIALMSGLIST = "/v2/tim/getspecialmsglist";
    public static final String TIM_CLEAR_SPECIAL = "/v2/tim/cleanspecialmsg";

    //PC状态
    public static final String PC_STATUS = "/v2/tim/getpcstatus";

    /**
     * 获取企业配置信息
     */
    public static final String GET_MAILINFO = "/v2/tim/getemailinfo";

    public static final String GET_SALE_PLAN_STATIS = "/api/remind/usercount";//获取销售计划统计数据

    public static final String GET_SALE_PLAN_STATIS_LIST = "/api/remind/userlist";//获取销售计划统计列表数据

    public static final String GET_SALE_PLAN_INFO = "/api/remind/userdetail";//获取销售计划详情

    public static final String GET_4G_STATUS = "/pc/queryphone";//查询4g电话状态

    public static final String BIND_4G = "/pc/bind";//绑定4g电话

    public static final String CANCEL_BIND_4G = "/pc/unbind";//取消绑定4g电话

    public static final String CALL_4G = "/pc/call";//拨打电话

    public static final String SEND_SMS = "/pc/sendsms";//4G,发送短信

    public static final String GET_CHARACTER_RECOGN = "/v2/picture/recognitionmb";//微信识别

    public static final String SET_ADD_OCR = "/api/crm/addocr";//保存微信识别的文字

    public static final String GET_OCR = "/api/crm/getocr";//获取微信识别的文字

    public static final String V2_HEAT_UPGRADE = "/v2/heatupgrade";//热更新

    public static final String BUSINESS_NOTICE = "/v3/biz/getbusinessremind";//商机提醒

    public static final String GET_CUSTOMER_LIST = "/api/crmlist/my"; // 客户列表

    public static final String GET_VERIFICATION_CODE_FOR_SAFETY = "/v1/verify/messageask";//安全检测请求发送验证码

    public static final String VALIDATE_VERIFICATION_CODE_FOR_SAFETY = "/v1/verify/messageverify";//安全检测请求验证验证码
}
