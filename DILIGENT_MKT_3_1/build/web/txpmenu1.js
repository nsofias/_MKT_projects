//******************************************************************************
// ------ Apycom.com Tree-menu Data --------------------------------------------
//******************************************************************************


var tblankImage      = "img/blank.gif";
var tmenuWidth       = 280;
var tmenuHeight      = 0;
var tpressedFontColor = "#ffff00";  
var ttoggleMode = 1;
var titemHeight = 25;
//var tlevelDX = 200; 
var texpandItemClick =1;

var tabsolute        = 0;
var tleft            = 0;
var ttop             = 120;

var tfloatable       = 1;
var tfloatIterations = 6;
var tmoveable        = 0;
var tmoveImage       = "img/movepic.gif";
var tmoveImageHeight = 12;

var tfontStyle       = "normal 8pt Verdana";
var tfontColor       = ["#428EFF","#AA0000"];
var tfontDecoration  = ["none","underline"];
var titemBackColor   = ["#D6DFF7","#AA0000"];
var titemAlign       = "left";
var titemBackImage   = ["",""];
var titemCursor      = "hand";


var titemTarget      = "_blank";
var ticonWidth       = 16;
var ticonHeight      = 16;
var ticonAlign       = "left";

var tmenuBackImage   = "";
var tmenuBackColor   = "#D6DFF7";
var tmenuBorderColor = "#D6DFF7";
var tmenuBorderStyle = "solid";
var tmenuBorderWidth = 0;

var texpandBtn       =["img/expandbtn2.gif","img/expandbtn2.gif","img/collapsebtn2.gif"];
var texpandBtnW      = 15;
var texpandBtnH      = 15;
var texpandBtnAlign  = "left";

var texpanded = 0;

var tpoints       = 0;
var tpointsImage  = "";
var tpointsVImage = "";
var tpointsCImage = "";//img/Cosmote_Logo.jpg

// XP-Style Parameters
var tXPStyle = 0;
var tXPIterations = 5;                  // expand/collapse speed
var tXPTitleTopBackColor = "";
var tXPTitleBackColor    = "#C71585";
var tXPTitleLeft    = "";
var tXPExpandBtn    = ["img/xpexpand1.gif","img/xpexpand2.gif","img/xpcollapse1.gif","img/xpcollapse2.gif"];
var tXPBtnHeight    = 25;
var tXPIconHeight = 25; 
var tXPTitleBackImg = "";

var tstyles =
[
    ["tfontStyle=bold 10pt Verdana","titemBackColor=#C71585,#C71585","tfontColor=#FFFFFF,#FFFFFF", "tfontDecoration=none,none"],
    ["tfontStyle=bold 9pt Verdana","titemBackColor=none,none","tfontColor=#66004d,#66004d", "tfontDecoration=none,none"],
    ["tfontStyle= 8pt Verdana","titemBackColor=none,none","tfontColor=#66004d,#C71585", "tfontDecoration=none,underline"],
    ["tfontStyle= 7pt Verdana","tfontColor=#66004d,#66004d"],
    ["tfontStyle= 10pt Verdana","titemBackColor=none,none","tfontColor=#66004d,#66004d", "tfontDecoration=none,none"]
];

var tXPStyles =
[
    ["tXPTitleBackColor=#480082", "tXPExpandBtn=img/xpexpand3.gif,img/xpexpand4.gif,img/xpcollapse3.gif,img/xpcollapse4.gif", "tXPTitleBackImg=img/xptitle2.gif"]
];
 
 
 
 

var tmenuItems =
[
["My account", "", "img/MKT.jpg","","", "",,"0"],
    ["|login","login.jsp","img/icons/support.gif","", "", "Identify your self", "right","2"],
    ["|logout","login.jsp?logout=true","img/icons/support.gif","", "", "Identify your self", "right","2"],
    ["|Change password","change_password.jsp","img/icons/support.gif","", "", "Change your password", "_blank","2"],
    ["|about","Diligent MKT Project.pptx","img/icons/support.gif","", "", "general info", "_blank","2"],
   
["+DashBoards", "", "img/MKT.jpg","","", "",,"0"],    
["|Alarm Scorers","dashboard1.jsp","img/sad.jpg","", "", "DashBoard", "right","4"],  
["|Major Tickets","dashboard3.jsp","img/MKT.jpg","", "", "DashBoard", "right","4"],
["|Previous day Summary","summary.jsp","img/MKT.jpg","", "", "DashBoard", "_blank","4"], 
["|History","history.jsp","img/MKT.jpg","", "", "DashBoard", "_blank","4"], 
       
["+COPPER", "", "img/MKT.jpg","","", "",,"0"],            
    ["|Active equipment",,"img/MKT.jpg","", "", "DSL Alarms", "right","1"], 
        ["||alarms","alarms.jsp?title=COPPER active equipment alarms&type=TYPE_COPPER","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||alarms (Gantt)","alarms_1.jsp?title=COPPER active equipment alarms&type=TYPE_COPPER&criticality=0","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||tickets","tickets.jsp?title=COPPER active equipment tickets&type=TYPE_COPPER&unhidden&uncanceled=ON","img/icons/paper.gif","", "", "DSL", "right","2"],  
        ["||map","map.jsp??type=TYPE_COPPER&status=alive&MAPSIZE=1500","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],                                  
        ["||Distribution","registrations.jsp?type=TYPE_COPPER","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],
        ["||Scorers","scorers.jsp?reportType=events&type=TYPE_COPPER","img/sad.jpg","", "", "DSL", "right","2"], 
        ["||lines",,"img/icons/paper.gif","", "", "DSL", "right","2"],
        ["|||Disconnected.(No Massive)","lines.jsp?type=TYPE_COPPER&STOPPED_NOT_MASSIVE","img/icons/paper.gif","", "", "DSL", "right","2"],
        ["|||4G BackUp","lines.jsp?type=TYPE_COPPER&FOUR_G_BACKUP","img/icons/paper.gif","", "", "DSL", "right","2"], 
        ["|||4G BackUp Disconnected(No Massive)","lines.jsp?type=TYPE_COPPER&FOUR_G_BACKUP_STOPPED","img/icons/paper.gif","", "", "DSL", "right","2"], 
        
    ["|Passive equipment",,"img/MKT.jpg","", "", "DSL Alarms", "right","1"],
        ["||alarms","alarms.jsp?title=COPPER passive equipment alarms&type=TYPE_COPPER_CABLE","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||alarms (Gantt)","alarms_1.jsp?title=COPPER passive equipment alarms&type=TYPE_COPPER_CABLE&criticality=0","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||tickets","tickets.jsp?title=COPPER passive equipment tickets&type=TYPE_COPPER_CABLE&disconnected=2&uncanceled=ON","img/icons/paper.gif","", "", "DSL", "right","2"],  
        ["||map","map.jsp??type=TYPE_COPPER_CABLE&status=alive&MAPSIZE=1500","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],                                  
        ["||Distribution","registrations.jsp?type=TYPE_COPPER_CABLE","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],
        ["||Scorers","scorers.jsp?reportType=events&type=TYPE_COPPER_CABLE","img/sad.jpg","", "", "DSL", "right","2"], 
        ["||lines",,"img/icons/paper.gif","", "", "DSL", "right","2"],
        ["|||Disconnected.(No Massive)","lines.jsp?type=TYPE_COPPER_CABLE&STOPPED_NOT_MASSIVE","img/icons/paper.gif","", "", "DSL", "right","2"],
        
["+GPON", "", "img/MKT.jpg","","", "",,"0"],              
    ["|Active equipment",,"img/MKT.jpg","", "", "DSL Alarms", "right","1"],
        ["||alarms","alarms.jsp?title=GPON active equipment alarms&type=TYPE_GPON","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||alarms (Gantt)","alarms_1.jsp?title=GPON active equipment alarms&type=TYPE_GPON&criticality=0","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||tickets","tickets.jsp?title=GPON active equipment tickets&GPON Alarms active equipment&type=TYPE_GPON&unhidden&uncanceled=ON","img/icons/paper.gif","", "", "DSL", "right","2"],  
        ["||map","map.jsp??type=TYPE_GPON&status=alive&MAPSIZE=1500","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],                                  
        ["||Distribution","registrations.jsp?type=TYPE_GPON","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],
        ["||Scorers","scorers.jsp?reportType=events&type=TYPE_GPON","img/sad.jpg","", "", "DSL", "right","2"],         
        ["||lines",,"img/icons/paper.gif","", "", "DSL", "right","2"],
        ["|||Disconnected.(No Massive)","lines.jsp?type=TYPE_GPON&STOPPED_NOT_MASSIVE","img/icons/paper.gif","", "", "DSL", "right","2"],
        
    ["|Passive equipment",,"img/MKT.jpg","", "", "DSL Alarms", "right","1"],
        ["||alarms","alarms.jsp?title=GPON passive equipment alarms&type=TYPE_GPON_CABLE","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||alarms (Gantt)","alarms_1.jsp?title=GPON passive equipment alarms&type=TYPE_GPON_CABLE&criticality=0","img/icons/paper.gif","", "", "DSL Alarms", "right","2"], 
        ["||tickets","tickets.jsp?title=GPON passive equipment tickets&type=TYPE_GPON_CABLE&disconnected=2&uncanceled=ON","img/icons/paper.gif","", "", "DSL", "right","2"],  
        ["||map","map.jsp??type=TYPE_GPON_CABLE&status=alive&MAPSIZE=1500","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],                                  
        ["||Distribution","registrations.jsp?type=TYPE_GPON_CABLE","img/icons/paper.gif","", "", "DSL Alarms", "right","2"],        
        ["||Scorers","scorers.jsp?reportType=events&type=TYPE_GPON_CABLE","img/sad.jpg","", "", "DSL", "right","2"],         
        ["||lines",,"img/icons/paper.gif","", "", "DSL", "right","2"],
        ["|||Disconnected.(No Massive)","lines.jsp?type=TYPE_GPON_CABLE&STOPPED_NOT_MASSIVE","img/icons/paper.gif","", "", "DSL", "right","2"], 
        
["Orders", "", "img/icons/1_.gif","","", "",,"0"],        
    ["|SVT Issuess","orders_1.jsp?actionType=SVTIssue_action","img/icons/paper.gif","", "", "DSL/BRAS/CARDAlarms", "right","3"],
    ["|CRM Issuess","orders_1.jsp?actionType=CRM_action","img/icons/paper.gif","", "", "DSL/BRAS/CARDAlarms", "right","3"],  
    ["|SVT Stats","orders.jsp","img/icons/paper.gif","", "", "DSL/BRAS/CARDAlarms", "right","3"],  
        
["+Tools", "", "img/MKT.jpg","","", "",,"0"], 
    ["|Dig_tool","logs.jsp","img/icons/paper.gif","", "", "dig_tool", "right","2"],
    ["|correlation_info","correlation_info.jsp","img/icons/paper.gif","", "", "correlation_info", "right","2"],
    ["|Customer Status","search.jsp","img/icons/paper.gif","", "", "dig_tool", "right","2"],
    ["|Input flow errors","formatErrors.jsp","img/icons/paper.gif","", "", "MKT flow errors", "right","2"],    
    
["admin", "", "img/MKT.jpg","","", "",,"0"],
    ["|Accounts","showUsers.jsp","img/icons/paper.gif","", "", "DSL Alarms", "_blank","2"],    
    ["|Processes","threadsViewer.jsp?Refresh=Refresh","img/icons/paper.gif","", "", "Running Processes etc...", "right","2"],
    ["|Visitors","sessions.jsp?Refresh=Refresh","img/icons/paper.gif","", "", "Running sessions ...", "right","2"],    
    ["|Events","events.jsp","img/icons/paper.gif","", "", "Events log", "right","2"]
        
];

apy_tmenuInit();
 