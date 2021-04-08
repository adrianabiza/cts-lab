package ro.ase.csie.cts.dp.facade;

public class FacadeAPIJoc {
	//interfata modificata pentru a obtine profilul unui jucator
    public static String getProfil(String username, String password){
        //1.creare conexiune
        ConexiuneServerJoc conexiuneServerJoc = new ConexiuneServerJoc();
        conexiuneServerJoc.conectare();

        //2.login player
        Player player = new Player();
        player.login(conexiuneServerJoc);

        //3.obtinem proofilul
        ProfilPlayer profil = player.getProfil();

        //4.obtinem datele
        String dateProfil = profil.getProfil();

        return dateProfil;
    }
}
