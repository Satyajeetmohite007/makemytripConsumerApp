package com.nt.response;


public class Ticket {
		Integer ticket_no;
		String pasanger_name;
		Integer age;
		String passanger_Cl;
		String passanger_Dst;
		String status;
		
		public Integer getTicket_no() {
			return ticket_no;
		}
		public void setTicket_no(Integer ticket_no) {
			this.ticket_no = ticket_no;
		}
		public String getPasanger_name() {
			return pasanger_name;
		}
		public void setPasanger_name(String pasanger_name) {
			this.pasanger_name = pasanger_name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getPassanger_Cl() {
			return passanger_Cl;
		}
		public void setPassanger_Cl(String passanger_Cl) {
			this.passanger_Cl = passanger_Cl;
		}
		public String getPassanger_Dst() {
			return passanger_Dst;
		}
		public void setPassanger_Dst(String passanger_Dst) {
			this.passanger_Dst = passanger_Dst;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Ticket [ticket_no=" + ticket_no + ", pasanger_name=" + pasanger_name + ", age=" + age
					+ ", passanger_Cl=" + passanger_Cl + ", passanger_Dst=" + passanger_Dst + ", status=" + status
					+ "]";
		}
		
}
