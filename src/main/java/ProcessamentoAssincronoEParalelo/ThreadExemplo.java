package ProcessamentoAssincronoEParalelo;

public class ThreadExemplo {
    public static void main(String[] args) {
//     Thread thread = new Thread(new BarraDeCarregamento2());
//     Thread thread2 = new Thread(new BarraDeCarregamento3());
//
//     thread.start();
//     thread2.start();
//
//     System.out.println("Nome da thread: " + thread.getName());
//     System.out.println("Nome da thread: " + thread2.getName());

        GeradorPDF iniciarGerarPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPdf);

        iniciarGerarPdf.start();
        iniciarBarraDeCarregamento.start();

    }
}

class GeradorPDF extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Iniciar Gerador de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}

class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        try{
            while(true){
                Thread.sleep(500);
                if(!iniciarGeradorPdf.isAlive()){
                    break;
                }
                System.out.println("Loading ...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class BarraDeCarregamento2 implements Runnable{
    @Override
    public void run() {
            try {
            Thread.sleep(3000);
            System.out.println("Rodei 2 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class BarraDeCarregamento3 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Rodei 3 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}