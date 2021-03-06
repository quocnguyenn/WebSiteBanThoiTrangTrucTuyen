package fit.se.daos;

import java.util.List;

import fit.se.model.TaiKhoan;

public interface TaiKhoanDAO {
	public TaiKhoan addTaiKhoan(TaiKhoan taiKhoan);
	public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan);
	public TaiKhoan removeTaiKhoan(TaiKhoan taiKhoan);
	public List<TaiKhoan> getAllTaiKhoan();
	public List<TaiKhoan> getTaiKhoanByIDAndMK(String tenTaiKhoan,String matKhau);
}
