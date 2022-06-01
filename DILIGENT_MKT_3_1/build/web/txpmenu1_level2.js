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
    
       
["+COPPER", "", "img/MKT.jpg","","", "",,"0"],            
        
    ["|Passive equipment",,"img/MKT.jpg","", "", "DSL Alarms", "right","1"],
        ["||tickets","tickets.jsp?title=COPPER passive equipment tickets&type=TYPE_COPPER_CABLE&disconnected=2&uncanceled=ON","img/icons/paper.gif","", "", "DSL", "right","2"],  
        ["||lines",,"img/icons/paper.gif","", "", "DSL", "right","2"],
        ["|||4G BackUp","lines.jsp?type=TYPE_COPPER_CABLE&FOUR_G_BACKUP","img/icons/paper.gif","", "", "DSL", "right","2"], 
        ["|||4G BackUp Disconnected(No Massive)","lines.jsp?type=TYPE_COPPER_CABLE&FOUR_G_BACKUP_STOPPED","img/icons/paper.gif","", "", "DSL", "right","2"], 
        
["+GPON", "", "img/MKT.jpg","","", "",,"0"],              
        
    ["|Passive equipment",,"img/MKT.jpg","", "", "DSL Alarms", "right","1"],
        ["||tickets","tickets.jsp?title=GPON passive equipment tickets&type=TYPE_GPON_CABLE&disconnected=2&uncanceled=ON","img/icons/paper.gif","", "", "DSL", "right","2"]                 
];

apy_tmenuInit();
 