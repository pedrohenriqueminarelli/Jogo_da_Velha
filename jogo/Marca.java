package jogo;

public class Marca
{
    private char simbolo;

    public Marca (char smb) throws Exception
    {
        if(smb!='x' || smb !='O') throw new Exception("O símbolo precisa ser O ou X!");
        this.simbolo=smb;
        // validar smb, garantindo que ele
        // seja 'X' ou 'O' e coloca-lo em
        // simbolo
        // dar excecao em caso de valor invalido
    }

    public char getSimbolo ()
    {
        return this.simbolo;
    }

    @Override
    public String toString ()
    {
        return ""+simbolo;
    }

    @Override
    public boolean equals (Object obj)
    {
        if(this==obj) return true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass()) return false;
        Marca M = (Marca)obj;
        if(this.simbolo!=M.simbolo) return false;
        return true;
    }

    @Override
    public int hashCode ()
    {
        int ret = 2;
        ret= ret*2+ ((Character)this.simbolo).hashCode();
        if (ret<0) ret= -ret;
        return ret;
    }
}