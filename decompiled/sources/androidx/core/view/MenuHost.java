package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public interface MenuHost {
    void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1);

    void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2);

    @android.annotation.SuppressLint({"LambdaLast"})
    void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r2, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r3);

    void invalidateMenu();

    void removeMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r1);
}
