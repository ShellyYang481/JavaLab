package equals;

import java.util.PrimitiveIterator.OfDouble;

public class Employee {
	private String id;
	
	public Employee(String id) {
		if (id==null) {
			//IllegalArgumentException是Runtime Exception的一種
			throw new IllegalArgumentException("ID不得為空值");
		}
	}
	
	

//	@Override
//	public boolean equals(Object obj) {
//		
//		if ( obj instanceof Employee) {
//			Employee emp = (Employee)obj;
//			//下方的equals是借用String文字的逐字比較
//			//String有改寫override繼承來的equals方法
//			return this.id.equals(emp.id);
//			
//		}
//		return false;
//	}
//	@Override
//	public int hashCode() {
//		//回傳代表物件的數字，通常會跟你equals中比較的屬性有關
//		//借用String hashcode滿足java的規範
//		return id.hashCode();
//	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("id="+id+",被GC!");

		super.finalize();
	}
	
	@Override
	public String toString() {

		return String.format("Employee(%s)", id);
	}

}

