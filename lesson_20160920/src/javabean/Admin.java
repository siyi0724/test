package javabean;

import java.io.Serializable;
import java.net.URLEncoder;

public class Admin implements Serializable{
	    private int id;
        private String name;
        private String pwd;
        /*���*/
        
		/*public Admin(String name, String pwd) {
			this.name = name;
			this.pwd = pwd;
		}*/
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		@Override
		public String toString() {
		// TODO �Զ����ɵķ������
		return name+pwd;
		}
    
}
