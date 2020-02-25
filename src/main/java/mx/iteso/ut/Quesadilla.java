package mx.iteso.ut;

/**
 * Hello world!
 *
 */
public class Quesadilla {
    private Queso queso;
    private Tortilla tortilla;
    private QuesoManchego quesoM;
    private QuesoChihuahua quesoC;
    private Tortilla tortilla1;
    private TortillaMaiz tortillaM1;
    private TortillaHarina tortillaH1;
    private int heatLevel;

    public final String prepareSingle() {


     while (getQueso().getCurrentTemperature()
             < getQueso().getMeltingTemperature()
             && getTortilla().getCurrentTemperature()
             < getTortilla().getToastTemperature()) {
         getTortilla().setCurrentTemperature(
                 getTortilla().getCurrentTemperature() + getHeatLevel());
         getQueso().setCurrentTemperature(
                 getQueso().getCurrentTemperature() + getHeatLevel());
         if (getTortilla().getCurrentTemperature()
                 >= getTortilla().getToastTemperature()) {
             getTortilla().toast(true);
         }
         if (getQueso().getCurrentTemperature()
                 >= getQueso().getMeltingTemperature()) {
             getQueso().melt(true);
         }
     }

     if (getQueso().isMelted() && getTortilla().isToasted()) {
         return "Perfect quesadilla";
     }
     if (getQueso().isMelted() && !getTortilla().isToasted()) {
         return "Good quesadilla";
     }
     if (!getQueso().isMelted() && getTortilla().isToasted()) {
         return "Terrible quesadilla";
     }
     else {
         return "You ran out of gas";
     }

    }

    public final String prepareSingleHarinaManchego() {

        while (getQuesoM().getCurrentTemperature()
                < getQuesoM().getMeltingTemperature()
                && getTortillaH().getCurrentTemperature()
                < getTortillaH().getToastTemperature()) {
            getTortillaH().setCurrentTemperature(getTortillaH()
                    .getCurrentTemperature() + getHeatLevel());
            getQuesoM().setCurrentTemperature(getQuesoM()
                    .getCurrentTemperature() + getHeatLevel());
            if (getTortillaH().getCurrentTemperature()
                    >= getTortillaH().getToastTemperature()) {
                getTortillaH().toast(true);
            }
            if (getQuesoM().getCurrentTemperature()
                    >= getQuesoM().getMeltingTemperature()) {
                getQuesoM().melt(true);
            }
        }

        if (getQuesoM().isMelted() && getTortillaH().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQuesoM().isMelted() && !getTortillaH().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQuesoM().isMelted() && getTortillaH().isToasted()) {
            return "Terrible quesadilla";
        }
        else {
            return "You ran out of gas";
        }

    }

    public final String prepareSingleHarinaChihuahua() {

        while (getQuesoC().getCurrentTemperature()
                < getQuesoC().getMeltingTemperature()
                && getTortillaH().getCurrentTemperature()
                < getTortillaH().getToastTemperature()) {
            getTortillaH().setCurrentTemperature(getTortillaH()
                    .getCurrentTemperature() + getHeatLevel());
            getQuesoC().setCurrentTemperature(getQuesoC()
                    .getCurrentTemperature() + getHeatLevel());
            if (getTortillaH().getCurrentTemperature()
                    >= getTortillaH().getToastTemperature()) {
                getTortillaH().toast(true);
            }
            if (getQuesoC().getCurrentTemperature()
                    >= getQuesoC().getMeltingTemperature()) {
                getQuesoC().melt(true);
            }
        }

        if (getQuesoC().isMelted() && getTortillaH().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQuesoC().isMelted() && !getTortillaH().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQuesoC().isMelted() && getTortillaH().isToasted()) {
            return "Terrible quesadilla";
        }
        else {
            return "You ran out of gas";
        }

    }

    public final String prepareSingleMaizManchego() {

        while (getQuesoM().getCurrentTemperature()
                < getQuesoM().getMeltingTemperature()
                && getTortillaM().getCurrentTemperature()
                        < getTortillaM().getToastTemperature()) {
            getTortillaM().setCurrentTemperature(getTortillaM()
                    .getCurrentTemperature() + getHeatLevel());
            getQuesoM().setCurrentTemperature(getQuesoM()
                    .getCurrentTemperature() + getHeatLevel());
            if (getTortillaM().getCurrentTemperature() >= getTortillaM()
                    .getToastTemperature()) {
                getTortillaM().toast(true);
            }
            if (getQuesoM().getCurrentTemperature() >= getQuesoM()
                    .getMeltingTemperature()) {
                getQuesoM().melt(true);
            }
        }

        if (getQuesoM().isMelted() && getTortillaM().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQuesoM().isMelted() && !getTortillaM().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQuesoM().isMelted() && getTortillaM().isToasted()) {
            return "Terrible quesadilla";
        }
        else {
            return "You ran out of gas";
        }

    }

    public final String prepareSingleMaizChihuahua() {

        while (getQuesoC().getCurrentTemperature() < getQuesoC()
                .getMeltingTemperature()
                && getTortillaM().getCurrentTemperature()
                < getTortillaM().getToastTemperature()) {
            getTortillaM().setCurrentTemperature(getTortillaM()
                    .getCurrentTemperature() + getHeatLevel());
            getQuesoC().setCurrentTemperature(getQuesoC()
                    .getCurrentTemperature() + getHeatLevel());
            if (getTortillaM().getCurrentTemperature() >= getTortillaM()
                    .getToastTemperature()) {
                getTortillaM().toast(true);
            }
            if (getQuesoC().getCurrentTemperature() >= getQuesoC()
                    .getMeltingTemperature()) {
                getQuesoC().melt(true);
            }
        }

        if (getQuesoC().isMelted() && getTortillaM().isToasted()) {
            return "Perfect quesadilla";
        }
        if (getQuesoC().isMelted() && !getTortillaM().isToasted()) {
            return "Good quesadilla";
        }
        if (!getQuesoC().isMelted() && getTortillaM().isToasted()) {
            return "Terrible quesadilla";
        }
        else {
            return "You ran out of gas";
        }

    }

    public final String prepareDouble() {
        // tortilla 1 tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso derretido
        // tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso no derretido
        // tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
        // tortilla 1 tostada, tortilla 2 tostada, queso no derretido
        while (getQueso().getCurrentTemperature() < getQueso()
                .getMeltingTemperature()
                && getTortilla().getCurrentTemperature() < getTortilla()
                .getToastTemperature()
                && getTortilla1().getCurrentTemperature() < getTortilla1()
                .getToastTemperature()) {
            getTortilla().setCurrentTemperature(getTortilla()
                    .getCurrentTemperature() + getHeatLevel());
            getTortilla().setCurrentTemperature(getTortilla()
                    .getCurrentTemperature() + getHeatLevel());
            getQueso().setCurrentTemperature(getQueso()
                    .getCurrentTemperature() + getHeatLevel());
            if (getTortilla().getCurrentTemperature() >= getTortilla1()
                    .getToastTemperature()) {
                getTortilla().toast(true);
            }
            if (getTortilla1().getCurrentTemperature() >= getTortilla1()
                    .getToastTemperature()) {
                getTortilla1().toast(true);
            }
            if (getQueso().getCurrentTemperature() >= getQueso()
                    .getMeltingTemperature()) {
                getQueso().melt(true);
            }
        }
        if (getQueso().isMelted() && getTortilla().isToasted()
                && !getTortilla1().isToasted()) { //true true flase
            return "Good quesadilla t2 not toasted";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()
                && !getTortilla1().isToasted()) { //f t f
            return "Terrible quesadilla q not melted && t2 not toasted";
        }
        if (getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla1().isToasted()) { //t t t
            return "Perfect quesadilla";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla1().isToasted()) { //t f t
            return "Good quesadilla t1 not toasted";
        }
        if (!getQueso().isMelted() && getTortilla().isToasted()
                && getTortilla1().isToasted()) { //f t t
            return "Good quesadilla q not melted";
        }
        if (!getQueso().isMelted() && !getTortilla().isToasted()
                && getTortilla1().isToasted()) { //f f t
            return "Terrible quesadilla q not melted && t1 not toasted";
        }
        if (!getQueso().isMelted() && !getTortilla().isToasted()
                && !getTortilla1().isToasted()) { //f f f
            return "You ran out of gas";
        }
        if (getQueso().isMelted() && !getTortilla().isToasted()
                && !getTortilla1().isToasted()) { //t f f
            return "Terrible quesadilla neither t is toasted";
        }
        else {
            return "You ran out of gas";
        }


    }

    public Queso getQueso() {
        return queso;
    }

    public final void setQueso(final Queso queso) {
        this.queso = queso;
    }

    public final Tortilla getTortilla() {
        return tortilla;
    }

    public final void setTortilla(final Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public final int getHeatLevel() {
        return heatLevel;
    }

    public final void setHeatLevel(final int heatLevel) {
        this.heatLevel = heatLevel;
    }

    public final QuesoManchego getQuesoM() {
        return quesoM;
    }

    public final void setQuesoM(final QuesoManchego quesoM) {
        this.quesoM = quesoM;
    }

    public final QuesoChihuahua getQuesoC() {
        return quesoC;
    }

    public final void setQuesoC(final QuesoChihuahua quesoC) {
        this.quesoC = quesoC;
    }


    public final TortillaMaiz getTortillaM() {
        return tortillaM1;
    }

    public final void setTortillaM(final TortillaMaiz tortilla) {
        this.tortillaM1 = tortilla;
    }

    public final TortillaHarina getTortillaH() {
        return tortillaH1;
    }

    public final void setTortillaH(final TortillaHarina tortilla) {
        this.tortillaH1 = tortilla;
    }
    public final Tortilla getTortilla1() {
        return tortilla;
    }

    public final void setTortilla1(final Tortilla tortilla1) {
        this.tortilla1 = tortilla1;
    }


}
