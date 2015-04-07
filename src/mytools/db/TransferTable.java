package mytools.db;

public class TransferTable {

	private mycommons.db.connection.ParaConnection paraConnectionSouce;
	private mycommons.db.Table tableSource;
	private mycommons.db.connection.ParaConnection paraConnectionTarget;
	private mycommons.db.Table tableTarget;
	/***
	public TransferTable(mycommons.db.connection.ParaConnection in_source,mycommons.db.Table in_source_table){
		
	}
	***/
	public void transfer(mycommons.db.connection.ParaConnection in_connection_source,mycommons.db.Table in_source_table,mycommons.db.connection.ParaConnection in_connection_target,mycommons.db.Table in_target_table){
		
		this.paraConnectionSouce=in_connection_source;
		this.paraConnectionTarget=in_connection_target;
		this.tableSource=in_source_table;
		this.tableTarget=in_target_table;
		
	}
}
