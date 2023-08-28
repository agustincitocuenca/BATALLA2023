package battle2023.ucp;

public abstract class shieldbase {
    
        private String material;
        private int resistencia;
    
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getResistencia() {
            return resistencia;
        }

        public void setResistencia(int resistencia) {
            this.resistencia = resistencia;
        }

        public  Shield(String material, int resistencia) {
            this.material = material;
            this.resistencia = resistencia;
}


