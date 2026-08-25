package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes2.dex */
public interface Reference {
    void apply();

    androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget();

    androidx.constraintlayout.core.state.helpers.Facade getFacade();

    java.lang.Object getKey();

    void setConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidget r1);

    void setKey(java.lang.Object r1);
}
