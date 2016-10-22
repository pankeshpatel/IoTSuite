package framework;

public interface IProfileDB {

	public void setprofile(String newIndex, TempStruct newprofileValue);

	public TempStruct getprofile(String index);

}