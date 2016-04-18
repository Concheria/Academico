/*
 * Autor: Daniel Somarribas Quir�s
 * b57072
 * 2016
 */
package Modelo.Objetos;

/**
 *
 * @author sqdan
 */
public class Usuario 
{
    private String User;
    private String pass;

    /**
     *
     * @param login
     * @param pass
     */
    public Usuario(String login, String pass) {
        this.User = login;
        this.pass = pass;
    }

    /**
     *
     * @return
     */
    public String getUser() {
        return User;
    }

    /**
     *
     * @param User
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     *
     * @return
     */
    public String getPass() {
        return pass;
    }

    /**
     *
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    /**
     *
     * @return
     */
    public String getInfo()
    {
        String info;
        
        info = "Login: "+getUser()
                +"Pass: "+getPass();
        
        return info;
    }
}
