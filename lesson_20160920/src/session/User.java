package session;

import java.io.Serializable;

public class User implements Serializable{
        private String name;
        private String pwd;
		public User(String name, String pwd) {
			this.name = name;
			this.pwd = pwd;
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
