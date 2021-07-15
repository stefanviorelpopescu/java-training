package designPattern_2;

public class Dispenser10Lei implements DispenseChain {
    private DispenseChain chain;
    private ATMResources lei10BanknoteNr;

    public Dispenser10Lei(ATMResources lei10BanknoteNr)
    {
        this.lei10BanknoteNr = lei10BanknoteNr;
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
        if(currency.getAmount() >= 10)
        {
            num = Math.min(currency.getAmount() / 10, lei10BanknoteNr.getBanknoteNr() );
            int remainder = currency.getAmount() - (num * 10);

            if (remainder != 0)
            {
                ok= this.chain.dispense(new Currency(remainder));
            }
            else
            {
                ok=true;
            }
        }
        if (currency.getAmount()==0)
        {
            ok = true;
        }
        if (ok && num!=0)
        {
            System.out.println("Primeste " + num + (num == 1 ? " bancnota" : " bancnote") + " de 10 lei ");
            lei10BanknoteNr.substractBanknoteNr(num);
        }
        if(!ok)
        {
            ok=this.chain.dispense(currency);
        }
        return ok;

    }
}
