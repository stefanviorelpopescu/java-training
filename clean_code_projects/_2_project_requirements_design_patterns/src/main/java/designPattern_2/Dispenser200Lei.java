package designPattern_2;

public class Dispenser200Lei implements DispenseChain {
    private DispenseChain chain;
    private ATMResources lei200BanknoteNr;

    public Dispenser200Lei(ATMResources lei200BanknoteNr)
    {
        this.lei200BanknoteNr = lei200BanknoteNr;
    }

    @Override
    public void setNextChain(DispenseChain nextChain)
    {
        this.chain=nextChain;
    }

    @Override
    public boolean dispense(Currency currency)
    {
        boolean ok=false;
        int num=0;
        if(currency.getAmount() >= 200) {

            num = Math.min(currency.getAmount() / 200, lei200BanknoteNr.getBanknoteNr() );
            int remainder = currency.getAmount() - (num * 200);

            if (remainder != 0)
            {
                ok = this.chain.dispense(new Currency(remainder));
            }
            else
            {
                ok = true;
            }
        }
        if (currency.getAmount()==0)
        {
            ok = true;
        }
        if (ok && num!=0)
        {
            System.out.println("Primeste " + num + (num == 1 ? " bancnota" : " bancnote") + " de 200 lei ");
            lei200BanknoteNr.substractBanknoteNr(num);
        }
        if(!ok)
        {
            ok = this.chain.dispense(currency);
        }
        return ok;

    }
}

