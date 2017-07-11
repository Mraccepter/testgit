//package annotation;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.List;
//
////创建数据库的sql命令
//public class TableCreator {
//
//		public static void main(String[] args) {
//			if(args.length < 1)
//			{
//				System.out.println("arguments: annotated classes");
//				System.exit(0);
//			}
//			for(String className :args)
//			{
//				Class<?> cl = Class.forName(className);
//				DBTable dbTable = cl.getAnnotation(DBTable.class);
//				if(dbTable == null)
//				{
//					System.out.println("NO DBTable annotations in class " + className);
//					continue;
//				}
//				String tableName = dbTable.name();
//				if(tableName.length() < 1)
//				{
//					tableName = cl.getName().toUpperCase();
//				}
//				List<String> columnDefs= new ArrayList<String>();
//				for(Field fields: cl.getFields())
//				{
//					String columnName = null;
//					Annotation[] anns = fields.getDeclaredAnnotations();
//					if(anns.length < 1)
//					{
//						continue;
//					}
//					if(anns[0] instanceof SQLInteger)
//					{
//						SQLInteger sInt = (SQLInteger) anns[0];
//						
//						columnName = fields.getName().to
//					}
//				}
//				
//					
//			}
//		}
//}
