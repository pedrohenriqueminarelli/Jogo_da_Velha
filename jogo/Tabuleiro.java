package jogo;

public class Tabuleiro implements Cloneable
{
    // a principio, toda igual a null
    private Marca matriz [][];

    public Tabuleiro ()
    {
        this.matriz = new Marca [3][3];
    }

    public boolean haMarcaNaPosicao (int lin, int col) throws Exception
    {
        if(lin<1 || col<1 || lin>3 || col>3) throw new Exception("A linha ou a coluna não podem ser maiores que três, e não podem ser menores que 1!");
        if(matriz[lin][col]==null) return false;
        return true;
    }

    public Marca getMarcaNaPosicao (int lin, int col) throws Exception
    {
        if(lin<1 || col<1 || lin>3 || col>3) throw new Exception("A linha ou a coluna não podem ser maiores que três, e não podem ser menores que 1!");
        return matriz[lin][col];
        // retornar a marca que tem em
        // matriz[lin][col]
        // dar excecao caso lin ou col invalido
    }

    public void setMarcaNaPosicao (Marca mrc, int lin, int col) throws Exception
    {
        if(lin<1 || col<1 || lin>3 || col>3) throw new Exception("A linha ou a coluna não podem ser maiores que três, e não podem ser menores que 1!");
        if(mrc==null) throw new Exception("A marca não pode ser nula!");
        this.matriz[lin][col]=mrc;
        // colocar mrc em matriz[lin][col],
        // dar excecao caso lin ou col invalido
        // dar excecao caso mrc seja null
    }

    @Override
    public String toString ()
    {
        String res="";
        for(int linhas=0; linhas<3; linhas++ ){

        }
        // retornar em um String o tabuleiro
        // formatado para ser exibido na tela
    }

    @Override
    public boolean equals (Object obj)
    {
        // retornar true se this for igual a obj ou false caso contrario
    }

    @Override
    public int hashCode ()
    {
        // faça
    }

    // construtor de copia
    public Tabuleiro (Tabuleiro modelo) throws Exception
    {
        // faça
    }

    @Override
    public Object clone ()
    {
        // faça
    }
}