package designPattern_2;

public class Dispenser100Lei implements DispenseChain {

    private DispenseChain chain;
    private ATMResources lei100BanknoteNr;

    public Dispenser100Lei(ATMResources lei100BanknoteNr)
    {
        this.lei100BanknoteNr = lei100BanknoteNr;
    }

    @Override
    public void setNextChain(DispenseChain nextChain)
    {
        this.chain = nextChain;
    }

    @Override
    public boolean dispense(Currency currency)
    {
        boolean ok=false;
        int num=0;
        if(currency.getAmount() >= 100)
        {
            num = Math.min(currency.getAmount() / 100, lei100BanknoteNr.getBanknoteNr() );
            int remainder = currency.getAmount() - (num * 100);

            if (remainder != 0)
            {
                ok= this.chain.dispense(new Currency(remainder));

            }
            else
            {
                ok = true;
            }
        }
        if (currency.getAmount() == 0)
        {
            ok = true;
        }
        if (ok && num!=0)
        {
            System.out.println("Primeste " + num + (num == 1 ? " bancnota" : " bancnote") + " de 100 lei ");
            lei100BanknoteNr.substractBanknoteNr(num);
        }
        if(!ok)
        {
            ok=this.chain.dispense(currency);
        }
        return ok;


    }
}
