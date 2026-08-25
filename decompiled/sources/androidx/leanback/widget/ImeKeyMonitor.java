package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public interface ImeKeyMonitor {

    /* JADX INFO: loaded from: classes.dex */
    public interface ImeKeyListener {
        boolean onKeyPreIme(android.widget.EditText r1, int r2, android.view.KeyEvent r3);
    }

    void setImeKeyListener(androidx.leanback.widget.ImeKeyMonitor.ImeKeyListener r1);
}
