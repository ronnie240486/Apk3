package androidx.leanback.app;

/* JADX INFO: loaded from: classes2.dex */
public class BaseSupportFragment extends androidx.leanback.app.BrandedSupportFragment {
    public final androidx.leanback.util.StateMachine.Condition COND_TRANSITION_NOT_SUPPORTED;
    public final androidx.leanback.util.StateMachine.Event EVT_ENTRANCE_END;
    public final androidx.leanback.util.StateMachine.Event EVT_ON_CREATE;
    public final androidx.leanback.util.StateMachine.Event EVT_ON_CREATEVIEW;
    public final androidx.leanback.util.StateMachine.Event EVT_PREPARE_ENTRANCE;
    public final androidx.leanback.util.StateMachine.Event EVT_START_ENTRANCE;
    public final androidx.leanback.util.StateMachine.State STATE_ENTRANCE_COMPLETE;
    public final androidx.leanback.util.StateMachine.State STATE_ENTRANCE_INIT;
    public final androidx.leanback.util.StateMachine.State STATE_ENTRANCE_ON_ENDED;
    public final androidx.leanback.util.StateMachine.State STATE_ENTRANCE_ON_PREPARED;
    public final androidx.leanback.util.StateMachine.State STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW;
    public final androidx.leanback.util.StateMachine.State STATE_ENTRANCE_PERFORM;
    public final androidx.leanback.util.StateMachine.State STATE_START;
    public java.lang.Object mEntranceTransition;
    public final androidx.leanback.app.ProgressBarManager mProgressBarManager;
    public final androidx.leanback.util.StateMachine mStateMachine;








    @android.annotation.SuppressLint({"ValidFragment"})
    public BaseSupportFragment() {
            r4 = this;
            r4.<init>()
            androidx.leanback.util.StateMachine$State r0 = new androidx.leanback.util.StateMachine$State
            java.lang.String r1 = "START"
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r4.STATE_START = r0
            androidx.leanback.util.StateMachine$State r0 = new androidx.leanback.util.StateMachine$State
            java.lang.String r1 = "ENTRANCE_INIT"
            r0.<init>(r1)
            r4.STATE_ENTRANCE_INIT = r0
            androidx.leanback.app.BaseSupportFragment$1 r0 = new androidx.leanback.app.BaseSupportFragment$1
            r0.<init>(r4)
            r4.STATE_ENTRANCE_ON_PREPARED = r0
            androidx.leanback.app.BaseSupportFragment$2 r0 = new androidx.leanback.app.BaseSupportFragment$2
            r0.<init>(r4)
            r4.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW = r0
            androidx.leanback.app.BaseSupportFragment$3 r0 = new androidx.leanback.app.BaseSupportFragment$3
            r0.<init>(r4)
            r4.STATE_ENTRANCE_PERFORM = r0
            androidx.leanback.app.BaseSupportFragment$4 r0 = new androidx.leanback.app.BaseSupportFragment$4
            r0.<init>(r4)
            r4.STATE_ENTRANCE_ON_ENDED = r0
            androidx.leanback.util.StateMachine$State r0 = new androidx.leanback.util.StateMachine$State
            java.lang.String r1 = "ENTRANCE_COMPLETE"
            r0.<init>(r1, r2, r3)
            r4.STATE_ENTRANCE_COMPLETE = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "onCreate"
            r0.<init>(r1)
            r4.EVT_ON_CREATE = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "onCreateView"
            r0.<init>(r1)
            r4.EVT_ON_CREATEVIEW = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "prepareEntranceTransition"
            r0.<init>(r1)
            r4.EVT_PREPARE_ENTRANCE = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "startEntranceTransition"
            r0.<init>(r1)
            r4.EVT_START_ENTRANCE = r0
            androidx.leanback.util.StateMachine$Event r0 = new androidx.leanback.util.StateMachine$Event
            java.lang.String r1 = "onEntranceTransitionEnd"
            r0.<init>(r1)
            r4.EVT_ENTRANCE_END = r0
            androidx.leanback.app.BaseSupportFragment$5 r0 = new androidx.leanback.app.BaseSupportFragment$5
            r0.<init>()
            r4.COND_TRANSITION_NOT_SUPPORTED = r0
            androidx.leanback.util.StateMachine r0 = new androidx.leanback.util.StateMachine
            r0.<init>()
            r4.mStateMachine = r0
            androidx.leanback.app.ProgressBarManager r0 = new androidx.leanback.app.ProgressBarManager
            r0.<init>()
            r4.mProgressBarManager = r0
            return
    }

    public java.lang.Object createEntranceTransition() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void createStateMachineStates() {
            r2 = this;
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_START
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTRANCE_INIT
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTRANCE_ON_PREPARED
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTRANCE_PERFORM
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTRANCE_ON_ENDED
            r0.addState(r1)
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r2.STATE_ENTRANCE_COMPLETE
            r0.addState(r1)
            return
    }

    public void createStateMachineTransitions() {
            r4 = this;
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_START
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_INIT
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ON_CREATE
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_COMPLETE
            androidx.leanback.util.StateMachine$Condition r3 = r4.COND_TRANSITION_NOT_SUPPORTED
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_COMPLETE
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ON_CREATEVIEW
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_INIT
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_ON_PREPARED
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_PREPARE_ENTRANCE
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_PREPARED
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ON_CREATEVIEW
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_PREPARED
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_PERFORM
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_START_ENTRANCE
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_PREPARED_ON_CREATEVIEW
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_PERFORM
            r0.addTransition(r1, r2)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_PERFORM
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_ON_ENDED
            androidx.leanback.util.StateMachine$Event r3 = r4.EVT_ENTRANCE_END
            r0.addTransition(r1, r2, r3)
            androidx.leanback.util.StateMachine r0 = r4.mStateMachine
            androidx.leanback.util.StateMachine$State r1 = r4.STATE_ENTRANCE_ON_ENDED
            androidx.leanback.util.StateMachine$State r2 = r4.STATE_ENTRANCE_COMPLETE
            r0.addTransition(r1, r2)
            return
    }

    public final androidx.leanback.app.ProgressBarManager getProgressBarManager() {
            r1 = this;
            androidx.leanback.app.ProgressBarManager r0 = r1.mProgressBarManager
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            r1.createStateMachineStates()
            r1.createStateMachineTransitions()
            androidx.leanback.util.StateMachine r0 = r1.mStateMachine
            r0.start()
            super.onCreate(r2)
            androidx.leanback.util.StateMachine r2 = r1.mStateMachine
            androidx.leanback.util.StateMachine$Event r0 = r1.EVT_ON_CREATE
            r2.fireEvent(r0)
            return
    }

    public void onEntranceTransitionEnd() {
            r0 = this;
            return
    }

    public void onEntranceTransitionPrepare() {
            r0 = this;
            return
    }

    public void onEntranceTransitionStart() {
            r0 = this;
            return
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            androidx.leanback.util.StateMachine r1 = r0.mStateMachine
            androidx.leanback.util.StateMachine$Event r2 = r0.EVT_ON_CREATEVIEW
            r1.fireEvent(r2)
            return
    }

    public void prepareEntranceTransition() {
            r2 = this;
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$Event r1 = r2.EVT_PREPARE_ENTRANCE
            r0.fireEvent(r1)
            return
    }

    public void runEntranceTransition(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void startEntranceTransition() {
            r2 = this;
            androidx.leanback.util.StateMachine r0 = r2.mStateMachine
            androidx.leanback.util.StateMachine$Event r1 = r2.EVT_START_ENTRANCE
            r0.fireEvent(r1)
            return
    }
}
