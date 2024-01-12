package it.epicode.week1.day5;


    public  class Audio extends  MediaElement implements playback{

        private int volume;
        public Audio(String title, int durata,int volume) {
            super(title, durata);
            this.volume=volume;
        }

        public  void abbassaVolume(int volume) {

            if ((this.volume-volume) >= 0) {
                this.volume -= volume;
            }else{
                this.volume=0;
                System.out.println("il volume è " + volume);
            }
        }
        public void alzaVolume(int volume){
            if ((this.volume+volume) <=100){
                this.volume+=volume;
            }else {
                this.volume=100;
                System.out.println("il volume è " + volume);
            }
        }
        @Override
        public void play() {
            for (int i=0;i<durata;i++){
                System.out.print( "il titolo è "+ title );
                for (int k=0;k<volume;k++){
                    System.out.print("!");
                }
                System.out.println();
            }

        }


    }

