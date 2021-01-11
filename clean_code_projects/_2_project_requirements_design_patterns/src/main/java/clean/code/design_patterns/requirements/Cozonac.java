package clean.code.design_patterns.requirements;

public class Cozonac {
    private String aluat;
    private String umplutura;
    private String topping;

    public Cozonac(Builder build) {
        this.aluat = build.aluat;
        this.umplutura = build.umplutura;
        this.topping = build.topping;
    }

    public String getAluat() {
        return aluat;
    }

    public String getUmplutura() {
        return umplutura;
    }

    public String getTopping() {
        return topping;
    }

    public static class Builder {
        private String aluat;
        private String umplutura;
        private String topping;

        public Builder(String aluat) {
            this.aluat = aluat;
        }

        public Builder umplutura(String umplutura) {
            this.umplutura = umplutura;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Cozonac build() {
            return new Cozonac(this);
        }
    }
}