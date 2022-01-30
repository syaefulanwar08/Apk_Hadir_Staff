package testAplikasiStaff.run;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import testAplikasiStaff.data.dataGabungan;
import testAplikasiStaff.pages.PageGabungan;
import testAplikasiStaff.screenshots.Screenshots;

public class Gabungan extends Reporting {

	AndroidDriver<MobileElement> driver;

	Screenshots sc;
	PageGabungan gabungan;

	@BeforeTest
	public void initializeObjects() throws Exception {
		sc = new Screenshots();
		gabungan = new PageGabungan(driver);
	}

	@Test
	public void modulGabungan() throws Exception {
		/////////// REGISTER////////////
		ExtentTest test0 = extentReports.createTest("Modul Register");
		gabungan.clickRegister();
		test0.log(Status.PASS, "User berhasil masuk ke halaman Register");

		gabungan.clickUntukFoto();
		test0.log(Status.PASS, "User berhasil masuk ke halaman ambil foto");

		Thread.sleep(5000);
		gabungan.clickAmbilFoto();
		test0.log(Status.PASS, "User berhasil ambil foto selfie");

		gabungan.clickOK();
		test0.log(Status.PASS, "User berhasil klik button ok");

		gabungan.setNama1(dataGabungan.NAMAREG);
		test0.log(Status.PASS, "User berhasil mengisi nama");

		gabungan.setNIK1(dataGabungan.NIKREG);
		test0.log(Status.PASS, "User berhasil mengisi NIK");

		gabungan.setEmail(dataGabungan.EMAILREG);
		test0.log(Status.PASS, "User berhasil mengisi email");

		gabungan.setPassword1(dataGabungan.PASSWORD);
		test0.log(Status.PASS, "User berhasil mengisi password");

		gabungan.clickRegister();
		test0.log(Status.PASS, "User berhasil mendaftarkan diri");

		gabungan.clickOK();
		test0.log(Status.PASS, "User berhasil klik button ok");
		///////////////////////////////////////////////////////

		////// MODUL Login /////////
		ExtentTest test1 = extentReports.createTest("Modul Login");
		gabungan.setNIK(dataGabungan.NIK);
		test1.log(Status.PASS, "User berhasil mengisi NIK");

		gabungan.setPassword(dataGabungan.PASSWORD);
		test1.log(Status.PASS, "User berhasil mengisi NIK");

		gabungan.clickbtnMasuk();
		test1.log(Status.PASS, "User berhasil masuk aplikasi Hadir");

		////////////////////////////////////////////////////////
		/////////////// ABSEN MASUK//////////////////
		////////////// JIKA TIDAK TELAT//////////////////////
		ExtentTest test2 = extentReports.createTest("Modul Absen Masuk");
		gabungan.clickAbsenMasuk();
		test2.log(Status.PASS, "User berhasil masuk ke form Absen Masuk");

		Thread.sleep(20000);
		gabungan.clickBtnKamera();
		test2.log(Status.PASS, "User berhasil klik button kamera");

		gabungan.clickUlangiSelfie();
		test2.log(Status.PASS, "User berhasil klik button ulangi selfie");

		Thread.sleep(4000);
		gabungan.clickBtnKamera3();
		test2.log(Status.PASS, "User berhasil klik button kamera");

		gabungan.clickKirimData();
		test2.log(Status.PASS, "User berhasil klik button kirim data");

		gabungan.clickTXTLuarJarak(dataGabungan.JARAK);
		test2.log(Status.PASS, "User berhasil klik button ulangi selfie");

		gabungan.clickLanjutkan();
		test2.log(Status.PASS, "User berhasil klik button Lanjutkan");

		gabungan.clickOKAbsen();
		test2.log(Status.PASS, "User berhasil klik button OK");
		Thread.sleep(2000);

		/////////////////// JIKA TELAT//////////////////
//		ExtentTest test2 = extentReports.createTest("Modul Absen Masuk");
//		gabungan.clickAbsenMasuk();
//		test2.log(Status.PASS, "User berhasil masuk ke form Absen Masuk");
//		
//		gabungan.clicklstAlasanTelat();
//		test2.log(Status.PASS, "User berhasil klik Dropdown telat");
//		
//		gabungan.clicklstKendalaPerjalanan();
//		test2.log(Status.PASS, "User berhasil klik Kendala Perjalanan");
//		
//		gabungan.clicklstAlasanTelat();
//		test2.log(Status.PASS, "User berhasil klik Dropdown telat");
//		
//		gabungan.clicklstUrusanPribadi();
//		test2.log(Status.PASS, "User berhasil klik Urusan Pribadi");
//		
//		gabungan.clicklstAlasanTelat();
//		test2.log(Status.PASS, "User berhasil klik Dropdown telat");
//		
//		gabungan.clicklstUrusanPekerjaan();
//		test2.log(Status.PASS, "User berhasil klik Urusan Pekerjaan");
//		
//		gabungan.clicklstAlasanTelat();
//		test2.log(Status.PASS, "User berhasil klik Dropdown telat");
//		
//		gabungan.clicklstLainnya();
//		test2.log(Status.PASS, "User berhasil klik Lainnya");
//		
//		gabungan.clickTXTLainnya(dataGabungan.LAINNYA);
//		test2.log(Status.PASS, "User berhasil mengisi text");
//		
//		gabungan.clickLanjutkan();
//		test2.log(Status.PASS, "User berhasil klik button Lanjutkan");
//		
//		Thread.sleep(20000);
//		gabungan.clickBtnKamera();
//		test2.log(Status.PASS, "User berhasil klik button Kamera");
//		
//		gabungan.clickUlangiSelfie();
//		test2.log(Status.PASS, "User berhasil klik button Ulangi Selfie");
//		
//		Thread.sleep(5000);
//		gabungan.clickBtnKamera3();
//		test2.log(Status.PASS, "User berhasil klik button Kamera");
//		
//		gabungan.clickKirimData();
//		test2.log(Status.PASS, "User berhasil klik button kirim data");
//		
//		gabungan.clickTXTLuarJarak(dataGabungan.JARAK);
//		test2.log(Status.PASS, "User berhasil klik button ulangi selfie");
//		
//		gabungan.clickLanjutkan();
//		test2.log(Status.PASS, "User berhasil klik button Lanjutkan");
//		
//		gabungan.clickOKAbsen();
//		test2.log(Status.PASS, "User berhasil klik button OK");
//		Thread.sleep(2000);
		///////////////////////////////
		////////// IJIN//////////////////
		ExtentTest test3 = extentReports.createTest("Modul Ijin");
		gabungan.gotoIjin();
		;
		test3.log(Status.PASS, "User berhasil masuk ke halaman gabungan");

		gabungan.klikDropdownKategori();
		test3.log(Status.PASS, "User berhasil klik dropdown kategori");

		gabungan.listSakit();
		test3.log(Status.PASS, "User berhasil memilih kategori sakit");

		gabungan.klikToggleHari();
		test3.log(Status.PASS, "User berhasil klik toggle hari");

		gabungan.klikBtnTanggalDari();
		gabungan.pilihTanggalDari();
		test3.log(Status.PASS, "User berhasil memilih tanggal dari");

		gabungan.klikBtnTanggalSampai();
		gabungan.pilihTanggalSampai();
		test3.log(Status.PASS, "User berhasil memilih tanggal sampai");

		gabungan.klikBtnFoto();
		gabungan.klikAmbilFoto();
		test3.log(Status.PASS, "User berhasil mengambil foto");

		gabungan.klikLanjutkan();
		gabungan.klikOkAlert();
		test3.log(Status.PASS, "User berhasil submit data gabungan kategori sakit");

		gabungan.gotoIjin();
		;
		gabungan.klikDropdownKategori();

		gabungan.listLainnya();
		test3.log(Status.PASS, "User berhasil memilih kategori lainnya");

		gabungan.isiFormAlasan(dataGabungan.Alasan);
		gabungan.klikLanjutkan();
		gabungan.klikOkAlert();
		test3.log(Status.PASS, "User berhasil submit data gabungan kategori lainnya");

		//////////////// DAFRTAR ABSENSI///////////////////
		ExtentTest test4 = extentReports.createTest("Modul Daftar Absensi");
		gabungan.goDaftarAbsensi();
		test4.log(Status.PASS, "User berhasil klik button gabungan absensi dan masuk ke halaman Daftar absensi");

		/////////////// Absen ////////////////

		Thread.sleep(2000);
		gabungan.clickAbsen();
		test4.log(Status.PASS, "User berhasil klik button kategori absen");

		gabungan.goPilihWaktu();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu");

		gabungan.clickDaily();
		test4.log(Status.PASS, "User berhasil klik kategori daily");

		gabungan.goCalendar();
		test4.log(Status.PASS, "User berhasil klik button calender dan menampilkan calendar");

		gabungan.clickDate();
		test4.log(Status.PASS, "User berhasil klik tanggal yang diinginkan");

		gabungan.clickOK4();
		test4.log(Status.PASS, "User berhasil klik OK4 untuk konfirmasi");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data");

		Thread.sleep(2000);
		gabungan.goPilihWaktuDaily();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu");

		gabungan.clickWeekly();
		test4.log(Status.PASS, "User berhasil klik kategori weekly");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data");

		Thread.sleep(2000);
		gabungan.goPilihWaktuWeekly();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu");

		gabungan.clickMonthly();
		test4.log(Status.PASS, "User berhasil klik kategori monthly");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data");

		/////////////// Telat ////////////////

		gabungan.dropdownAbsen();
		test4.log(Status.PASS, "User berhasil klik dropdown absen");

		Thread.sleep(2000);
		gabungan.clickTelat();
		test4.log(Status.PASS, "User berhasil pilih kategori (telat)");

		gabungan.dropdownBelumTerproses();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (telat)");

		gabungan.clickApproved();
		test4.log(Status.PASS, "User berhasil pilih approved (telat)");

		///
		gabungan.goPilihWaktu();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (telat)");

		gabungan.clickDaily();
		test4.log(Status.PASS, "User berhasil klik kategori daily (telat)");

		gabungan.goCalendar1();
		test4.log(Status.PASS, "User berhasil klik button calender dan menampilkan calendar (telat)");

		gabungan.clickDate();
		test4.log(Status.PASS, "User berhasil klik tanggal yang diinginkan (telat)");

		gabungan.clickOK4();
		test4.log(Status.PASS, "User berhasil klik OK4 untuk konfirmasi (telat)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (telat)");

		gabungan.dropdownApproved();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (telat)");

		gabungan.clickRejected();
		test4.log(Status.PASS, "User berhasil pilih rejected (telat)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuDaily();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (telat)");

		gabungan.clickWeekly();
		test4.log(Status.PASS, "User berhasil klik kategori weekly (telat)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (telat)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuWeekly();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (telat)");

		gabungan.clickMonthly();
		test4.log(Status.PASS, "User berhasil klik kategori monthly (telat)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (telat)");

		/////////////// Pulang Cepat ////////////////

		gabungan.dropdownTelat();
		test4.log(Status.PASS, "User berhasil klik dropdown telat");

		Thread.sleep(2000);
		gabungan.clickPulangCepat();
		test4.log(Status.PASS, "User berhasil klik kategori (Pulang Cepat)");

		gabungan.dropdownBelumTerproses();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Pulang Cepat)");

		gabungan.clickApproved();
		test4.log(Status.PASS, "User berhasil pilih approved (Pulang Cepat)");

		///
		gabungan.goPilihWaktu();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Pulang Cepat)");

		gabungan.clickDaily();
		test4.log(Status.PASS, "User berhasil klik kategori daily (Pulang Cepat)");

		gabungan.goCalendar1();
		test4.log(Status.PASS, "User berhasil klik button calender dan menampilkan calendar (Pulang Cepat)");

		gabungan.clickDate();
		test4.log(Status.PASS, "User berhasil klik tanggal yang diinginkan (Pulang Cepat)");

		gabungan.clickOK4();
		test4.log(Status.PASS, "User berhasil klik OK4 untuk konfirmasi (Pulang Cepat)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Pulang Cepat)");

		gabungan.dropdownApproved();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Pulang Cepat)");

		gabungan.clickRejected();
		test4.log(Status.PASS, "User berhasil pilih rejected (Pulang Cepat)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuDaily();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Pulang Cepat)");

		gabungan.clickWeekly();
		test4.log(Status.PASS, "User berhasil klik kategori weekly (Pulang Cepat)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Pulang Cepat)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuWeekly();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Pulang Cepat)");

		gabungan.clickMonthly();
		test4.log(Status.PASS, "User berhasil klik kategori monthly (Pulang Cepat)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Pulang Cepat)");

		/////////////// Lembur ////////////////

		gabungan.dropdownPulangCepat();
		test4.log(Status.PASS, "User berhasil klik dropdown Pulang Cepat");

		Thread.sleep(2000);
		gabungan.clickLembur();
		test4.log(Status.PASS, "User berhasil klik kategori (Lembur)");

		gabungan.dropdownBelumTerproses();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Lembur)");

		gabungan.clickApproved();
		test4.log(Status.PASS, "User berhasil pilih approved (Lembur)");

		///
		gabungan.goPilihWaktu();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Lembur)");

		gabungan.clickDaily();
		test4.log(Status.PASS, "User berhasil klik kategori daily (Lembur)");

		gabungan.goCalendar1();
		test4.log(Status.PASS, "User berhasil klik button calender dan menampilkan calendar (Lembur)");

		gabungan.clickDate();
		test4.log(Status.PASS, "User berhasil klik tanggal yang diinginkan (Lembur)");

		gabungan.clickOK4();
		test4.log(Status.PASS, "User berhasil klik OK4 untuk konfirmasi (Lembur)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Lembur)");

		gabungan.dropdownApproved();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Lembur)");

		gabungan.clickRejected();
		test4.log(Status.PASS, "User berhasil pilih rejected (Lembur)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuDaily();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Lembur)");

		gabungan.clickWeekly();
		test4.log(Status.PASS, "User berhasil klik kategori weekly (Lembur)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Lembur)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuWeekly();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Lembur)");

		gabungan.clickMonthly();
		test4.log(Status.PASS, "User berhasil klik kategori monthly (Lembur)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Lembur)");

		/////////////// Izin ////////////////

		gabungan.dropdownLembur();
		test4.log(Status.PASS, "User berhasil klik dropdown lembur");

		Thread.sleep(2000);
		gabungan.clickIzin();
		test4.log(Status.PASS, "User berhasil klik kategori (Izin)");

		gabungan.dropdownBelumTerproses();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Izin)");

		gabungan.clickApproved();
		test4.log(Status.PASS, "User berhasil pilih approved (Izin)");

		///
		gabungan.goPilihWaktu();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Izin)");

		gabungan.clickDaily();
		test4.log(Status.PASS, "User berhasil klik kategori daily (Izin)");

		gabungan.goCalendar1();
		test4.log(Status.PASS, "User berhasil klik button calender dan menampilkan calendar (Izin)");

		gabungan.clickDate();
		test4.log(Status.PASS, "User berhasil klik tanggal yang diinginkan (Izin)");

		gabungan.clickOK4();
		test4.log(Status.PASS, "User berhasil klik OK4 untuk konfirmasi (Izin)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Izin)");

		gabungan.dropdownApproved();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Izin)");

		gabungan.clickRejected();
		test4.log(Status.PASS, "User berhasil pilih rejected (Izin)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuDaily();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Izin)");

		gabungan.clickWeekly();
		test4.log(Status.PASS, "User berhasil klik kategori weekly (Izin)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Izin)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuWeekly();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Izin)");

		gabungan.clickMonthly();
		test4.log(Status.PASS, "User berhasil klik kategori monthly (Izin)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Izin)");

		/////////////// Cuti ////////////////

		gabungan.dropdownIzin();
		test4.log(Status.PASS, "User berhasil klik dropdown izin");

		Thread.sleep(2000);
		gabungan.clickCuti();
		test4.log(Status.PASS, "User berhasil klik kategori (Cuti)");

		gabungan.dropdownBelumTerproses();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Cuti)");

		gabungan.clickApproved();
		test4.log(Status.PASS, "User berhasil pilih approved (Cuti)");

		///
		gabungan.goPilihWaktu();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Cuti)");

		gabungan.clickDaily();
		test4.log(Status.PASS, "User berhasil klik kategori daily (Cuti)");

		gabungan.goCalendar1();
		test4.log(Status.PASS, "User berhasil klik button calender dan menampilkan calendar (Cuti)");

		gabungan.clickDate();
		test4.log(Status.PASS, "User berhasil klik tanggal yang diinginkan (Cuti)");

		gabungan.clickOK4();
		test4.log(Status.PASS, "User berhasil klik OK4 untuk konfirmasi (Cuti)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Cuti)");

		gabungan.dropdownApproved();
		test4.log(Status.PASS, "User berhasil klik dropdown belum terproses (Cuti)");

		gabungan.clickRejected();
		test4.log(Status.PASS, "User berhasil pilih rejected (Cuti)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuDaily();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Cuti)");

		gabungan.clickWeekly();
		test4.log(Status.PASS, "User berhasil klik kategori weekly (Cuti)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Cuti)");

		Thread.sleep(2000);
		gabungan.goPilihWaktuWeekly();
		test4.log(Status.PASS, "User berhasil klik button pilih waktu (Cuti)");

		gabungan.clickMonthly();
		test4.log(Status.PASS, "User berhasil klik kategori monthly (Cuti)");

		gabungan.clickSearch();
		test4.log(Status.PASS, "User berhasil klik search untuk menampilkan data (Cuti)");

		gabungan.clickRefresh4();
		test4.log(Status.PASS, "User berhasil klik button refresh");

	}

}