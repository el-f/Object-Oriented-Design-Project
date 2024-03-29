package Model;

@SuppressWarnings("unused") //  All methods are here for completion sake, even if unused.
public class Pair<F, S> {
    /*
        A nice compact class to make some stuff easier/nicer to do.
        Same as Pair in Kotlin, and similar to Tuples in Python.
     */
    private F first;
    private S second;

    public Pair(F _first, S _second) {
        first = _first;
        second = _second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }
}
