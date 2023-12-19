package Pr_24;

public interface ChairAbstractFactory{
    VictorianChair createVictorianChair(int n);
    MagicChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}
