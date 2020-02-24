package mx.iteso.ut;

/**
 * @author hecto
 *
 */
public class Quesadilla {
    /**
     */
    private Queso queso;

    /**
     */
    private Tortilla tortilla;
    /**
     */
    private Tortilla tortilla2;

    /**
     */
    private int heatLevel;
    /**
     * @return null
     */
    public String prepareSingle() {
         while (getQueso().getCurrentTemperature()
                < getQueso().getMeltingTemperature()
&& getTortilla().getCurrentTemperature()
< getTortilla().getToastTemperature()) {

getTortilla().setCurrentTemperature(
getTortilla().getCurrentTemperature()
+ getHeatLevel());
getQueso().setCurrentTemperature(
getQueso().getCurrentTemperature()
+ getHeatLevel());

if (getTortilla().getCurrentTemperature()
>= getTortilla().getToastTemperature()
) {
getTortilla().toast(true);
}
if (getQueso().getCurrentTemperature()
>= getQueso().getMeltingTemperature()
) {
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
} else {
return "You ran out of gas";
}

}

/**
* @return null
*/
public String prepareDouble() {
while (getQueso().getCurrentTemperature()
< getQueso().getMeltingTemperature()
&& getTortilla().getCurrentTemperature()
< getTortilla().getToastTemperature()
&& getTortilla2().getCurrentTemperature()
< getTortilla2().getToastTemperature()) {

getTortilla().setCurrentTemperature(
getTortilla().getCurrentTemperature()
+ getHeatLevel());
getTortilla2().setCurrentTemperature(
getTortilla2().getCurrentTemperature()
+ getHeatLevel());
getQueso().setCurrentTemperature(
getQueso().getCurrentTemperature()
+ getHeatLevel());

if (getTortilla().getCurrentTemperature()
>= getTortilla().getToastTemperature()
) {
getTortilla().toast(true);
}

if (getTortilla2().getCurrentTemperature()
>= getTortilla2().getToastTemperature()
) {
getTortilla2().toast(true);
}

if (getQueso().getCurrentTemperature()
>= getQueso().getMeltingTemperature()) {
getQueso().melt(true);
}
}

// tortilla 1 tostada, tortilla 2 tostada, queso derretido
if (getTortilla().isToasted() && getTortilla2().isToasted()
&& getQueso().isMelted()) {
return "Perfect quesadilla";
}

// tortilla 1 no tostada, tortilla 2 tostada, queso derretido
if (!getTortilla().isToasted() && getTortilla2().isToasted()
&& getQueso().isMelted()) {
return "Excellent quesadilla";
}

// tortilla 1 no tostada, tortilla 2 tostada, queso no derretido
if (!getTortilla().isToasted() && getTortilla2().isToasted()
&& !getQueso().isMelted()) {
return "Good quesadilla";
}

// tortilla 1 y 2 no tostadas, queso no derretido
if (!getTortilla().isToasted() && !getTortilla2().isToasted()
&& !getQueso().isMelted()) {
return "You ran out of gas";
}

// tortilla 1 no tostada, tortilla 2 no tostada, queso derretido
if (!getTortilla().isToasted() && !getTortilla2().isToasted()
&& getQueso().isMelted()) {
return "Terrible quesadilla";
}

// tortilla 1 tostada, tortilla 2 tostada, queso no derretido
if (getTortilla().isToasted() && getTortilla2().isToasted()
&& !getQueso().isMelted()) {
return "Horrible quesadilla";
}

return "Normal quesadilla";
}

/**
* @return Queso
*/
public Queso getQueso() {
return queso;
}

/**
* @param q
* queso
*/
public void setQueso(final Queso q) {
this.queso = q;
}

/**
* @return Tortilla
*/
public Tortilla getTortilla() {
return tortilla;
}

/**
* @param t
* tortilla
*/
public void setTortilla(final Tortilla t) {
this.tortilla = t;
}

/**
* @return Tortilla
*/
public Tortilla getTortilla2() {
return tortilla2;
}

/**
* @param t
* tortilla
*/
public void setTortilla2(final Tortilla t) {
this.tortilla2 = t;
}

/**
* @return int
*/
public int getHeatLevel() {
return heatLevel;
}

/**
* @param heat
* heat
*/
public void setHeatLevel(final int heat) {
this.heatLevel = heat;
}
}

