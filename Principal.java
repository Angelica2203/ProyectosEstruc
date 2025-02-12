public class Principal 
{
    public static void main(String[] args) 
    {
        Metodos Mt = new Metodos();
        int d = Mt.SolicitarDimension();;
        int [][] m = Mt.LlenarMatriz(d);
        Mt.MostrarMatriz(m);
        Mt.MostrarMatrizImpares(m);
        Mt.MostrarMatrizPares(m);
    }
    
}
