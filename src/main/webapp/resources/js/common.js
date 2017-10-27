var Util = {
		SUCCESS : 0,
		ERROR : 1,
		getSelectionsIds : function(datagridId){
			//getSelections none 返回所有被选中的行，当没有记录被选中的时候将返回一个空数组。 
			var selectedIds = $(datagridId).datagrid("getSelections");
			console.log(selectedIds);
			var ids = [];//[1,2,3]
			for(var i in selectedIds){
				ids.push(selectedIds[i].id);
			}
			ids = ids.join(",");// 1,2,3
			return ids;
		},
		// 格式化时间
		formatDateTime : function(val, row) {
			var now = new Date(val);
			return now.format("yyyy-MM-dd hh:mm:ss");
		},
		// 格式化连接
		formatUrl : function(val, row) {
			if (val) {
				return "<a href='" + val + "' target='_blank'>查看</a>";
			}
			return "";
		},
		
}