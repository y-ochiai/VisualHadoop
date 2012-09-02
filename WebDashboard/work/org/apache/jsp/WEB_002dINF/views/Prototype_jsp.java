/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2012-08-29 08:28:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.wgp.util.FileNameFilter;
import org.wgp.util.FilePathUtil;

public final class Prototype_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/../common/javaScriptInclude.jsp", Long.valueOf(1345996528000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("    <html>\r\n");
      out.write("    <head>\r\n");
      out.write("    ");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write(" WGP  0.1  - Web Graphical Platform\r\n");
      out.write(" Copyright (c) 2012, WGP.LICENSES.COM\r\n");
      out.write(" Dual licensed under the MIT and GPL licenses\r\n");
      out.write(" http://www.opensource.org/licenses/mit-license.php\r\n");
      out.write(" http://www.gnu.org/licenses/gpl-2.0.html\r\n");
      out.write(" Date: 2012-04-29\r\n");
      out.write("-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/lib/jQuery/css/jquery-ui-1.8.19.custom.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/lib/jqGrid/css/ui.jqgrid.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/lib/jeegoocontext/skins/cm_default/style.css\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/wgp-graph.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/wgp.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\">\r\n");
      out.write("\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/lib/rgbcolor/rgbcolor.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<!-- ウィジェット用のjavaScript動的読みこみを行なう -->\r\n");

	// ウィジェットとなるjavaScriptを指定
	//TODO 残課題 ファイルパス指定を直接記入している。
	List<String> pathList = new ArrayList<String>();
	pathList.add("jQuery");
	pathList.add("underscore");
	pathList.add("backbone");
	pathList.add("dygraph");
	pathList.add("jeegoocontext");
	pathList.add("jqGrid");
	pathList.add("jquery.event.drag-2.2");
	pathList.add("jsTree");
	pathList.add("Raphael");
	pathList.add("wgp");
	String jsDirectoryPath = config.getServletContext()
			.getRealPath("resources/lib");
	File jsDirectory = new File(jsDirectoryPath);
	FileNameFilter nameFilter = new FileNameFilter(null, null, "js");

	// widgetMenuの一覧を取得する。
	String widgetKindsDirectoryPath =
		config.getServletContext().getRealPath("resources/lib/wgp/widget");
	File widgetDirectory = new File(widgetKindsDirectoryPath);
	File[] widgetFileList = widgetDirectory.listFiles(nameFilter);

	for (String directoryPath : pathList) {
		File elementDirectory = new File(jsDirectory, directoryPath);
		List<File> elementFileList = FilePathUtil.getAllFilePath(
				elementDirectory, nameFilter);
		if (elementFileList != null && elementFileList.size() > 0) {
			// ウィジェットとなるjavaScriptファイルのファイルパスを基にscriptタグを生成する。
			for (File jsFile : elementFileList) {
				String[] filePaths = jsFile.getAbsolutePath().split("WebContent");
				String tmpfilePath = filePaths[filePaths.length - 1];
				String filePath = tmpfilePath.replaceAll("\\\\", "/");
				out.print("<script type=\"text/javascript\" ");
				out.print("src=\"" + request.getContextPath()
						+ filePath
						+ "\">");
				out.println("</script>");
			}
		}
	}	

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/ganttChart/view/ganttChartView.js\" type=\"text/javaScript\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/ganttChart/model/ganttChartModel.js\" type=\"text/javaScript\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/ganttChart/mock/ganttChartDataMock.js\" type=\"text/javaScript\"></script>\r\n");
      out.write("    \r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body id=\"main\" oncontextmenu=\"return false;\" onload=\"self.focus();\">\r\n");
      out.write("    <div id=\"menuBar_\" style=\"width:1280px; height:20px;\"></div>\r\n");
      out.write("    <div id=\"toolBar_\" style=\"width:1280px; height:25px;\"></div>\r\n");
      out.write("    <div id=\"persArea\"></div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("// initialize perspective\r\n");
      out.write("var viewArea1 = {};\r\n");
      out.write("var viewArea2 = {};\r\n");
      out.write("\r\n");
      out.write("viewArea1.width = 300;\r\n");
      out.write("viewArea1.height = 400;\"WebContent/WEB-INF/views/BackbonePrototype2.jsp\"\r\n");
      out.write("viewArea1.rowspan = 1;\r\n");
      out.write("viewArea1.colspan = 1;\r\n");
      out.write("\r\n");
      out.write("viewArea2.width = 900;\r\n");
      out.write("viewArea2.height = 400;\r\n");
      out.write("viewArea2.rowspan = 1;\r\n");
      out.write("viewArea2.colspan = 1;\r\n");
      out.write("\r\n");
      out.write("var table = [\r\n");
      out.write("\t[new wgp.PerspactiveModel(viewArea1), new wgp.PerspactiveModel(viewArea2)]\r\n");
      out.write("];\r\n");
      out.write("var perspactiveView = new wgp.PerspactiveView({id:\"persArea\", collection:table});\r\n");
      out.write("perspactiveView.dropView(\"persArea_drop_0_0\", \"tree_area\");\r\n");
      out.write("perspactiveView.dropView(\"persArea_drop_0_1\", \"contents_area\");\r\n");
      out.write("\r\n");
      out.write("var appView = new wgp.AppView();\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/WebDashboard/resources/js/common/user.js\" type=\"text/javaScript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("//var GanttChartView = new ganttChartView({\r\n");
      out.write("//\t\tid : \"ganttChart_area\"\r\n");
      out.write("//\t});\r\n");
      out.write("//\tappView.addViews([GanttChartView]);\r\n");
      out.write("//\tsetInterval(function(){GanttChartDataMock()}, 500);\r\n");
      out.write("var ganttChart1 = {\r\n");
      out.write("    type : wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("\tjobId : \"1\",\r\n");
      out.write("\tjobName : \"job1\",\r\n");
      out.write("\tstatus : \"success\",\r\n");
      out.write("\tsubmitTime : \"2012-08-27 00:00:00\",\r\n");
      out.write("\tstartTime : \"2012-08-27 00:01:00\",\r\n");
      out.write("\tfinishTime : \"2012-08-27 00:10:00\"\r\n");
      out.write("};\r\n");
      out.write("var ganttChart2 = {\r\n");
      out.write("\t    type : wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("\t\tjobId : \"2\",\r\n");
      out.write("\t\tjobName : \"job2\",\r\n");
      out.write("\t\tstatus : \"failed\",\r\n");
      out.write("\t\tsubmitTime : \"2012-08-27 00:02:00\",\r\n");
      out.write("\t\tstartTime : \"2012-08-27 00:05:00\",\r\n");
      out.write("\t\tfinishTime : \"2012-08-27 00:20:00\"\r\n");
      out.write("\t};\r\n");
      out.write("var ganttChart3 = {\r\n");
      out.write("\t    type : wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("\t\tjobId : \"3\",\r\n");
      out.write("\t\tjobName : \"job3\",\r\n");
      out.write("\t\tstatus : \"success\",\r\n");
      out.write("\t\tsubmitTime : \"2012-08-27 00:05:00\",\r\n");
      out.write("\t\tstartTime : \"2012-08-27 00:010:00\",\r\n");
      out.write("\t\tfinishTime : \"2012-08-27 00:15:00\"\r\n");
      out.write("\t};\r\n");
      out.write("var ganttChart4 = {\r\n");
      out.write("\t    type : wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("\t\tjobId : \"4\",\r\n");
      out.write("\t\tjobName : \"job\",\r\n");
      out.write("\t\tstatus : \"killed\",\r\n");
      out.write("\t\tsubmitTime : \"2012-08-27 00:07:00\",\r\n");
      out.write("\t\tstartTime : \"2012-08-27 00:012:00\",\r\n");
      out.write("\t\tfinishTime : \"2012-08-27 00:30:00\"\r\n");
      out.write("\t};\r\n");
      out.write("sendModel = [{\r\n");
      out.write("\twindowId : \"ganttChart_area\",\r\n");
      out.write("\tdata:[ganttChart1, ganttChart2, ganttChart3, ganttChart4]\r\n");
      out.write("}];\r\n");
      out.write("appView.notifyEvent(sendModel);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var treeView = new wgp.TreeView({id:\"tree_area\", targetId:\"contents_area\"});\r\n");
      out.write("var tabView = new wgp.TabView({})\r\n");
      out.write("appView.addViews([treeView]);\r\n");
      out.write("\r\n");
      out.write("var treeProperty1 = {\r\n");
      out.write("\t    type:wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("\t    treeId:0,\r\n");
      out.write("\t\tdata: \"Ganttchart\",\r\n");
      out.write("\t\tid: \"/ganttchart/graph\",\r\n");
      out.write("\t\tparentTreeId: null\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("sendData = [{\r\n");
      out.write("\twindowId:\"tree_area\",\r\n");
      out.write("\tdata:[treeProperty1]\r\n");
      out.write("}];\r\n");
      out.write("appView.notifyEvent(sendData);\r\n");
      out.write("\r\n");
      out.write("var webSocketClientInstance = new webSocketClient(appView);\r\n");
      out.write("webSocketClientInstance.initialize();\r\n");
      out.write("\r\n");
      out.write("var graphDataInterval = function(windowId, value){\r\n");
      out.write("    var y = 0;\r\n");
      out.write("    function innerFunction(){\r\n");
      out.write("        var x = new Date();\r\n");
      out.write("        var sin = Math.sin(y * Math.PI / 180);\r\n");
      out.write("        var cos = Math.cos(y * Math.PI / 180);\r\n");
      out.write("\r\n");
      out.write("        y = y + value;\r\n");
      out.write("        \r\n");
      out.write("        var data = {\r\n");
      out.write("        \ttype:wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("        \tdata: [x,sin,cos]\r\n");
      out.write("        }\r\n");
      out.write("        var sendData = [{\r\n");
      out.write("        \twindowId: windowId,\r\n");
      out.write("        \tdata: [data]\r\n");
      out.write("        }]\r\n");
      out.write("\r\n");
      out.write("        appView.notifyEvent(sendData);\r\n");
      out.write("        \r\n");
      out.write("    };\r\n");
      out.write("    return innerFunction;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("setInterval(graphDataInterval(\"Memory\",18), 1000);\r\n");
      out.write("setInterval(graphDataInterval(\"CPU\",25), 1000);\r\n");
      out.write("\r\n");
      out.write("var property1 = {\r\n");
      out.write("    type:wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("    state:wgp.constants.STATE.NORMAL,\r\n");
      out.write("    objectName:\"MapStateElementView\",\r\n");
      out.write("    objectId : 1,\r\n");
      out.write("    pointX : 100,\r\n");
      out.write("    pointY : 100,\r\n");
      out.write("    width : 100,\r\n");
      out.write("    height : 100,\r\n");
      out.write("    zIndex : 0\r\n");
      out.write("};\r\n");
      out.write("var property2 = {\r\n");
      out.write("    type:wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("    state:wgp.constants.STATE.WARN,\r\n");
      out.write("    objectName:\"MapStateElementView\",\r\n");
      out.write("    objectId : 2,\r\n");
      out.write("    pointX : 250,\r\n");
      out.write("    pointY : 100,\r\n");
      out.write("    width : 100,\r\n");
      out.write("    height : 100\r\n");
      out.write("};\r\n");
      out.write("var property3 = {\r\n");
      out.write("    type:wgp.constants.CHANGE_TYPE.ADD,\r\n");
      out.write("    state:wgp.constants.STATE.ERROR,\r\n");
      out.write("    objectName:\"MapStateElementView\",\r\n");
      out.write("    objectId : 3,\r\n");
      out.write("    pointX : 400,\r\n");
      out.write("    pointY : 100,\r\n");
      out.write("    width : 100,\r\n");
      out.write("    height : 100\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var mapDataInterval = function(windowId){\r\n");
      out.write("\tfunction innerFunction(){\r\n");
      out.write("\t\tproperty1[\"state\"] = parseInt(Math.random() * 3);\r\n");
      out.write("\t\tproperty2[\"state\"] = parseInt(Math.random() * 3);\r\n");
      out.write("\t\tproperty3[\"state\"] = parseInt(Math.random() * 3);\r\n");
      out.write("\r\n");
      out.write("\t\tvar addData = [{\r\n");
      out.write("\t\t    windowId:windowId,\r\n");
      out.write("\t\t    data:[property1, property2, property3]\r\n");
      out.write("\t\t}];\r\n");
      out.write("\t\tappView.notifyEvent(addData);\r\n");
      out.write("\t};\r\n");
      out.write("\treturn innerFunction;\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("setInterval(mapDataInterval(\"contents_area_tab_0\"), 1000);\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("    </body>\r\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
