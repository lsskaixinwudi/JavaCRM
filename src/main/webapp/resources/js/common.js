var Util = {
		//对应ServerResoponse成功返回的状态 
		SUCCESS : 0,
		//对应ServerResoponse失败返回的状态 
		ERROR : 1,
		//将datagrid被选中的行拼接成以","分割的字符串:1,2,3
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
		// 0-9 的日期和时间，在前面补0：9 -> 09
		formatZero: function(n){
			 if(n>=0&&n<=9){
				 return "0"+n;
			 }else{
				 return n;
			 }
		 },
		// 格式化时间
		getCurrentDateTime : function() {
			var date = new Date();//Mon Oct 30 2017 22:08:37 GMT+0800
			var year=date.getFullYear();
			var month=date.getMonth()+1;
			var day=date.getDate();
			var hours=date.getHours();
			var minutes=date.getMinutes();
			var seconds=date.getSeconds();
			// 2017-01-01 02:23:06   yyyy-MM-dd hh:mm:ss
			return year+"-"+this.formatZero(month)+"-"+this.formatZero(day)+" "+this.formatZero(hours)+":"+this.formatZero(minutes)+":"+this.formatZero(seconds);
		},
		// 格式化连接
		formatUrl : function(val, row) {
			if (val) {
				return "<a href='" + val + "' target='_blank'>查看</a>";
			}
			return "";
		},
		
}