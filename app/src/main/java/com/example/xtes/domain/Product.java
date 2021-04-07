package com.example.xtes.domain;

public class Product {
		private int Pid;
		private String Pname;
		private String pimage;
		private int Ptype;
		private String Pcomman;
		private String Pbuyer;
		private String shop_price;
		public int getPid() {
			return Pid;
		}
		public void setPid(int pid) {
			Pid = pid;
		}
		public String getPname() {
			return Pname;
		}
		public void setPname(String pname) {
			Pname = pname;
		}
		public String getPimage() {
			return pimage;
		}
		public void setPimage(String pimage) {
			this.pimage = pimage;
		}
		public int getPtype() {
			return Ptype;
		}
		public void setPtype(int ptype) {
			Ptype = ptype;
		}
		public String getPcomman() {
			return Pcomman;
		}
		public void setPcomman(String pcomman) {
			Pcomman = pcomman;
		}
		public String getPbuyer() {
			return Pbuyer;
		}
		public void setPbuyer(String pbuyer) {
			Pbuyer = pbuyer;
		}
		public String getShop_price() {
			return shop_price;
		}
		public void setShop_price(String shop_price) {
			this.shop_price = shop_price;
		}
		
		
}
