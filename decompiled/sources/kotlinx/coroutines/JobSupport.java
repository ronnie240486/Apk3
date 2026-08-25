package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@kotlin.Metadata(bv = {}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006Á\u0001Â\u0001Ã\u0001B\u0012\u0012\u0007\u0010¾\u0001\u001a\u00020\u001b¢\u0006\u0006\b¿\u0001\u0010À\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0082\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0082\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\r\u0010_\u001a\u00020\u001b¢\u0006\u0004\b_\u0010?J\u0011\u0010b\u001a\u00060`j\u0002`a¢\u0006\u0004\bb\u0010cJ6\u0010e\u001a\u00020d2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\be\u0010fJF\u0010e\u001a\u00020d2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010g\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\be\u0010hJ\u0013\u0010i\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\bi\u0010AJB\u0010n\u001a\u00020\u0007\"\u0004\b\u0000\u0010j2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000m\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\u0017\u0010q\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\bp\u0010=J\u001f\u0010r\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010`j\u0004\u0018\u0001`aH\u0016¢\u0006\u0004\br\u0010sJ\u0019\u0010r\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\br\u0010&J\u0017\u0010t\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\bt\u0010uJ\u0015\u0010w\u001a\u00020\u00072\u0006\u0010v\u001a\u00020\u0003¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\by\u0010&J\u0017\u0010z\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bz\u0010&J\u0019\u0010}\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b{\u0010|J+\u0010\u0082\u0001\u001a\u00020\u007f2\n\b\u0002\u0010~\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0080\b¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0015\u0010\u0083\u0001\u001a\u00060`j\u0002`aH\u0016¢\u0006\u0005\b\u0083\u0001\u0010cJ\u001b\u0010\u0085\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u0084\u0001\u0010|J\u001d\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u0086\u0001\u0010CJ\u0019\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u00072\u0007\u0010\u008b\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0005\b\u008c\u0001\u0010uJ\u0012\u0010\u008e\u0001\u001a\u00020[H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0012\u0010\u0090\u0001\u001a\u00020[H\u0007¢\u0006\u0006\b\u0090\u0001\u0010\u008f\u0001J\u0012\u0010\u0092\u0001\u001a\u00020[H\u0010¢\u0006\u0006\b\u0091\u0001\u0010\u008f\u0001J\u0012\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0014\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0017\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0006H\u0080@ø\u0001\u0000¢\u0006\u0005\b\u0098\u0001\u0010AJT\u0010\u009d\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010j2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010m\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u009a\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001JT\u0010\u009f\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010j2\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00010k2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010m\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u009a\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009c\u0001R\u001e\u0010¡\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010ER\u001b\u0010¢\u0001\u001a\u00020\u001b*\u00020\u00198BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010§\u0001\u001a\u0007\u0012\u0002\b\u00030¤\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R0\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u0088\u00012\n\u0010¨\u0001\u001a\u0005\u0018\u00010\u0088\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010\u0096\u0001R\u0016\u0010¯\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010?R\u0013\u0010°\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010?R\u0013\u0010±\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010?R\u0014\u0010´\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b²\u0001\u0010³\u0001R\u0016\u0010¶\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010?R\u001b\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010·\u00018F¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010¼\u0001\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010?R\u0013\u0010½\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b½\u0001\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ä\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/selects/SelectClause0;", "Lkotlin/Function1;", "", "", "block", "", "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "Lkotlinx/coroutines/JobSupport$Finishing;", "state", "proposedUpdate", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/Incomplete;", "update", "", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/NodeList;", "list", "cause", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "cancelParent", "(Ljava/lang/Throwable;)Z", "notifyCompletion", "Lkotlinx/coroutines/JobNode;", "T", "notifyHandlers", "", "startInternal", "(Ljava/lang/Object;)I", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "expect", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "joinInternal", "()Z", "joinSuspend", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "makeCancelling", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/ChildHandleNode;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "child", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "lastChild", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "awaitSuspend", "start", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "removeNode$kotlinx_coroutines_core", "removeNode", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "(Ljava/lang/Throwable;)V", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "childCancelled", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "getChildJobCancellationCause", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "toString", "()Ljava/lang/String;", "toDebugString", "nameString$kotlinx_coroutines_core", "nameString", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "awaitInternal$kotlinx_coroutines_core", "awaitInternal", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "isActive", "isCompleted", "isCancelled", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isCompletedExceptionally", "active", "<init>", "(Z)V", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class JobSupport implements kotlinx.coroutines.Job, kotlinx.coroutines.ChildJob, kotlinx.coroutines.ParentJob, kotlinx.coroutines.selects.SelectClause0 {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _parentHandle;

    @org.jetbrains.annotations.NotNull
    private volatile /* synthetic */ java.lang.Object _state;

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlinx/coroutines/Job;", "parent", "", "getContinuationCancellationCause", "Lkotlinx/coroutines/JobSupport;", "job", "Lkotlinx/coroutines/JobSupport;", "Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class AwaitContinuation<T> extends kotlinx.coroutines.CancellableContinuationImpl<T> {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.JobSupport job;

        public AwaitContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.JobSupport r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.job = r3
                return
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        @org.jetbrains.annotations.NotNull
        public java.lang.Throwable getContinuationCancellationCause(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r3) {
                r2 = this;
                kotlinx.coroutines.JobSupport r0 = r2.job
                java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
                boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
                if (r1 == 0) goto L15
                r1 = r0
                kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
                java.lang.Throwable r1 = r1.getRootCause()
                if (r1 != 0) goto L14
                goto L15
            L14:
                return r1
            L15:
                boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
                if (r1 == 0) goto L1e
                kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
                java.lang.Throwable r3 = r0.cause
                return r3
            L1e:
                java.util.concurrent.CancellationException r3 = r3.getCancellationException()
                return r3
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final java.lang.String nameString() {
                r1 = this;
                java.lang.String r0 = "AwaitContinuation"
                return r0
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ChildCompletion extends kotlinx.coroutines.JobNode {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.ChildHandleNode child;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.JobSupport parent;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Object proposedUpdate;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.JobSupport.Finishing state;

        public ChildCompletion(@org.jetbrains.annotations.NotNull kotlinx.coroutines.JobSupport r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.JobSupport.Finishing r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.ChildHandleNode r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.state = r2
                r0.child = r3
                r0.proposedUpdate = r4
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                r3 = this;
                kotlinx.coroutines.JobSupport r4 = r3.parent
                kotlinx.coroutines.JobSupport$Finishing r0 = r3.state
                kotlinx.coroutines.ChildHandleNode r1 = r3.child
                java.lang.Object r2 = r3.proposedUpdate
                kotlinx.coroutines.JobSupport.access$continueCompleting(r4, r0, r1, r2)
                return
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", "", "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", "", "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Finishing implements kotlinx.coroutines.Incomplete {

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder;

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ int _isCompleting;

        @org.jetbrains.annotations.NotNull
        private volatile /* synthetic */ java.lang.Object _rootCause;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.NodeList list;

        public Finishing(@org.jetbrains.annotations.NotNull kotlinx.coroutines.NodeList r1, boolean r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                r0._isCompleting = r2
                r0._rootCause = r3
                r1 = 0
                r0._exceptionsHolder = r1
                return
        }

        private final java.util.ArrayList<java.lang.Throwable> allocateList() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                return r0
        }

        private final java.lang.Object getExceptionsHolder() {
                r1 = this;
                java.lang.Object r0 = r1._exceptionsHolder
                return r0
        }

        private final void setExceptionsHolder(java.lang.Object r1) {
                r0 = this;
                r0._exceptionsHolder = r1
                return
        }

        public final void addExceptionLocked(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
                r2 = this;
                java.lang.Throwable r0 = r2.getRootCause()
                if (r0 != 0) goto La
                r2.setRootCause(r3)
                return
            La:
                if (r3 != r0) goto Ld
                return
            Ld:
                java.lang.Object r0 = r2.getExceptionsHolder()
                if (r0 != 0) goto L17
                r2.setExceptionsHolder(r3)
                goto L35
            L17:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L2c
                if (r3 != r0) goto L1e
                return
            L1e:
                java.util.ArrayList r1 = r2.allocateList()
                r1.add(r0)
                r1.add(r3)
                r2.setExceptionsHolder(r1)
                goto L35
            L2c:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L36
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r3)
            L35:
                return
            L36:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r1 = "State is "
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // kotlinx.coroutines.Incomplete
        @org.jetbrains.annotations.NotNull
        public kotlinx.coroutines.NodeList getList() {
                r1 = this;
                kotlinx.coroutines.NodeList r0 = r1.list
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable getRootCause() {
                r1 = this;
                java.lang.Object r0 = r1._rootCause
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }

        @Override // kotlinx.coroutines.Incomplete
        public boolean isActive() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCancelling() {
                r1 = this;
                java.lang.Throwable r0 = r1.getRootCause()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isCompleting() {
                r1 = this;
                int r0 = r1._isCompleting
                return r0
        }

        public final boolean isSealed() {
                r2 = this;
                java.lang.Object r0 = r2.getExceptionsHolder()
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                if (r0 != r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Throwable> sealLocked(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3.getExceptionsHolder()
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = r3.allocateList()
                goto L1e
            Lb:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L18
                java.util.ArrayList r1 = r3.allocateList()
                r1.add(r0)
                r0 = r1
                goto L1e
            L18:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L3c
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L1e:
                java.lang.Throwable r1 = r3.getRootCause()
                if (r1 != 0) goto L25
                goto L29
            L25:
                r2 = 0
                r0.add(r2, r1)
            L29:
                if (r4 == 0) goto L34
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
                if (r1 != 0) goto L34
                r0.add(r4)
            L34:
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getSEALED$p()
                r3.setExceptionsHolder(r4)
                return r0
            L3c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r1 = "State is "
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
        }

        public final void setCompleting(boolean r1) {
                r0 = this;
                r0._isCompleting = r1
                return
        }

        public final void setRootCause(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                r0._rootCause = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Finishing[cancelling="
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                boolean r1 = r2.isCancelling()
                r0.append(r1)
                java.lang.String r1 = ", completing="
                r0.append(r1)
                boolean r1 = r2.isCompleting()
                r0.append(r1)
                java.lang.String r1 = ", rootCause="
                r0.append(r1)
                java.lang.Throwable r1 = r2.getRootCause()
                r0.append(r1)
                java.lang.String r1 = ", exceptions="
                r0.append(r1)
                java.lang.Object r1 = r2.getExceptionsHolder()
                r0.append(r1)
                java.lang.String r1 = ", list="
                r0.append(r1)
                kotlinx.coroutines.NodeList r1 = r2.getList()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.JobSupport> r0 = kotlinx.coroutines.JobSupport.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.JobSupport._state$FU = r0
            return
    }

    public JobSupport(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto La
            kotlinx.coroutines.Empty r1 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
            goto Le
        La:
            kotlinx.coroutines.Empty r1 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_NEW$p()
        Le:
            r0._state = r1
            r1 = 0
            r0._parentHandle = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitSuspend(kotlinx.coroutines.JobSupport r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.awaitSuspend(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.String access$cancellationExceptionMessage(kotlinx.coroutines.JobSupport r0) {
            java.lang.String r0 = r0.cancellationExceptionMessage()
            return r0
    }

    public static final /* synthetic */ void access$continueCompleting(kotlinx.coroutines.JobSupport r0, kotlinx.coroutines.JobSupport.Finishing r1, kotlinx.coroutines.ChildHandleNode r2, java.lang.Object r3) {
            r0.continueCompleting(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$joinSuspend(kotlinx.coroutines.JobSupport r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.joinSuspend(r1)
            return r0
    }

    private final boolean addLastAtomic(java.lang.Object r3, kotlinx.coroutines.NodeList r4, kotlinx.coroutines.JobNode r5) {
            r2 = this;
            kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1 r0 = new kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            r0.<init>(r5, r2, r3)
        L5:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r4.getPrevNode()
            int r3 = r3.tryCondAddNext(r5, r4, r0)
            r1 = 1
            if (r3 == r1) goto L15
            r1 = 2
            if (r3 == r1) goto L14
            goto L5
        L14:
            r1 = 0
        L15:
            return r1
    }

    private final void addSuppressedExceptions(java.lang.Throwable r4, java.util.List<? extends java.lang.Throwable> r5) {
            r3 = this;
            int r0 = r5.size()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r0 = r5.size()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Set r0 = java.util.Collections.newSetFromMap(r1)
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r5.next()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == r4) goto L19
            if (r1 == r4) goto L19
            boolean r2 = r1 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L19
            boolean r2 = r0.add(r1)
            if (r2 == 0) goto L19
            kotlin.ExceptionsKt.addSuppressed(r4, r1)
            goto L19
        L37:
            return
    }

    private final java.lang.Object awaitSuspend(kotlin.coroutines.Continuation<java.lang.Object> r3) {
            r2 = this;
            kotlinx.coroutines.JobSupport$AwaitContinuation r0 = new kotlinx.coroutines.JobSupport$AwaitContinuation
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r3)
            r0.<init>(r1, r2)
            r0.initCancellability()
            kotlinx.coroutines.ResumeAwaitOnCompletion r1 = new kotlinx.coroutines.ResumeAwaitOnCompletion
            r1.<init>(r0)
            kotlinx.coroutines.DisposableHandle r1 = r2.invokeOnCompletion(r1)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r0, r1)
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L25
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
        L25:
            return r0
    }

    private final java.lang.Object cancelMakeCompleting(java.lang.Object r7) {
            r6 = this;
        L0:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L2d
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L16
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            boolean r1 = r1.isCompleting()
            if (r1 == 0) goto L16
            goto L2d
        L16:
            kotlinx.coroutines.CompletedExceptionally r1 = new kotlinx.coroutines.CompletedExceptionally
            java.lang.Throwable r2 = r6.createCauseException(r7)
            r3 = 0
            r4 = 2
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            java.lang.Object r0 = r6.tryMakeCompleting(r0, r1)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 == r1) goto L0
            return r0
        L2d:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
    }

    private final boolean cancelParent(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.isScopedCoroutine()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            kotlinx.coroutines.ChildHandle r2 = r4.getParentHandle$kotlinx_coroutines_core()
            if (r2 == 0) goto L20
            kotlinx.coroutines.NonDisposableHandle r3 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r2 != r3) goto L15
            goto L20
        L15:
            boolean r5 = r2.childCancelled(r5)
            if (r5 != 0) goto L1f
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
        L20:
            return r0
    }

    private final void completeStateFinalization(kotlinx.coroutines.Incomplete r4, java.lang.Object r5) {
            r3 = this;
            kotlinx.coroutines.ChildHandle r0 = r3.getParentHandle$kotlinx_coroutines_core()
            if (r0 != 0) goto L7
            goto Lf
        L7:
            r0.dispose()
            kotlinx.coroutines.NonDisposableHandle r0 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r3.setParentHandle$kotlinx_coroutines_core(r0)
        Lf:
            boolean r0 = r5 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L17
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5
            goto L18
        L17:
            r5 = r1
        L18:
            if (r5 != 0) goto L1b
            goto L1d
        L1b:
            java.lang.Throwable r1 = r5.cause
        L1d:
            boolean r5 = r4 instanceof kotlinx.coroutines.JobNode
            if (r5 == 0) goto L4b
            r5 = r4
            kotlinx.coroutines.JobNode r5 = (kotlinx.coroutines.JobNode) r5     // Catch: java.lang.Throwable -> L28
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L28
            goto L55
        L28:
            r5 = move-exception
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in completion handler "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " for "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            r3.handleOnCompletionException$kotlinx_coroutines_core(r0)
            goto L55
        L4b:
            kotlinx.coroutines.NodeList r4 = r4.getList()
            if (r4 != 0) goto L52
            goto L55
        L52:
            r3.notifyCompletion(r4, r1)
        L55:
            return
    }

    private final void continueCompleting(kotlinx.coroutines.JobSupport.Finishing r1, kotlinx.coroutines.ChildHandleNode r2, java.lang.Object r3) {
            r0 = this;
            kotlinx.coroutines.ChildHandleNode r2 = r0.nextChild(r2)
            if (r2 == 0) goto Ld
            boolean r2 = r0.tryWaitForChild(r1, r2, r3)
            if (r2 == 0) goto Ld
            return
        Ld:
            java.lang.Object r1 = r0.finalizeFinishingState(r1, r3)
            r0.afterCompletion(r1)
            return
    }

    private final java.lang.Throwable createCauseException(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r3 instanceof java.lang.Throwable
        L6:
            if (r0 == 0) goto L18
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 != 0) goto L23
            r3 = 0
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = access$cancellationExceptionMessage(r2)
            r0.<init>(r1, r3, r2)
            r3 = r0
            goto L23
        L18:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"
            java.util.Objects.requireNonNull(r3, r0)
            kotlinx.coroutines.ParentJob r3 = (kotlinx.coroutines.ParentJob) r3
            java.util.concurrent.CancellationException r3 = r3.getChildJobCancellationCause()
        L23:
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(kotlinx.coroutines.JobSupport r1, java.lang.String r2, java.lang.Throwable r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L19
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L8
            r2 = r0
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            r3 = r0
        Ld:
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            if (r2 != 0) goto L15
            java.lang.String r2 = access$cancellationExceptionMessage(r1)
        L15:
            r4.<init>(r2, r3, r1)
            return r4
        L19:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: defaultCancellationException"
            r1.<init>(r2)
            throw r1
    }

    private final java.lang.Object finalizeFinishingState(kotlinx.coroutines.JobSupport.Finishing r6, java.lang.Object r7) {
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Le
            r0 = r1
            goto L10
        Le:
            java.lang.Throwable r0 = r0.cause
        L10:
            monitor-enter(r6)
            boolean r2 = r6.isCancelling()     // Catch: java.lang.Throwable -> L6b
            java.util.List r3 = r6.sealLocked(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.Throwable r4 = r5.getFinalRootCause(r6, r3)     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L22
            r5.addSuppressedExceptions(r4, r3)     // Catch: java.lang.Throwable -> L6b
        L22:
            monitor-exit(r6)
            r3 = 0
            if (r4 != 0) goto L27
            goto L30
        L27:
            if (r4 != r0) goto L2a
            goto L30
        L2a:
            kotlinx.coroutines.CompletedExceptionally r7 = new kotlinx.coroutines.CompletedExceptionally
            r0 = 2
            r7.<init>(r4, r3, r0, r1)
        L30:
            if (r4 == 0) goto L4c
            boolean r0 = r5.cancelParent(r4)
            if (r0 != 0) goto L3e
            boolean r0 = r5.handleJobException(r4)
            if (r0 == 0) goto L3f
        L3e:
            r3 = 1
        L3f:
            if (r3 == 0) goto L4c
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            java.util.Objects.requireNonNull(r7, r0)
            r0 = r7
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            r0.makeHandled()
        L4c:
            if (r2 != 0) goto L51
            r5.onCancelling(r4)
        L51:
            r5.onCompletionInternal(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r7)
        L5a:
            boolean r2 = r0.compareAndSet(r5, r6, r1)
            if (r2 == 0) goto L61
            goto L67
        L61:
            java.lang.Object r2 = r0.get(r5)
            if (r2 == r6) goto L5a
        L67:
            r5.completeStateFinalization(r6, r7)
            return r7
        L6b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private final kotlinx.coroutines.ChildHandleNode firstChild(kotlinx.coroutines.Incomplete r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.ChildHandleNode
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L18
            kotlinx.coroutines.NodeList r3 = r3.getList()
            if (r3 != 0) goto L13
            goto L19
        L13:
            kotlinx.coroutines.ChildHandleNode r1 = r2.nextChild(r3)
            goto L19
        L18:
            r1 = r0
        L19:
            return r1
    }

    private final java.lang.Throwable getExceptionOrNull(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 != 0) goto Lc
            goto Le
        Lc:
            java.lang.Throwable r1 = r3.cause
        Le:
            return r1
    }

    private final java.lang.Throwable getFinalRootCause(kotlinx.coroutines.JobSupport.Finishing r6, java.util.List<? extends java.lang.Throwable> r7) {
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r6 = r6.isCancelling()
            if (r6 == 0) goto L17
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = access$cancellationExceptionMessage(r5)
            r6.<init>(r7, r1, r5)
            return r6
        L17:
            return r1
        L18:
            java.util.Iterator r6 = r7.iterator()
        L1c:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L30
            java.lang.Object r0 = r6.next()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            r3 = r3 ^ r2
            if (r3 == 0) goto L1c
            goto L31
        L30:
            r0 = r1
        L31:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L36
            return r0
        L36:
            r6 = 0
            java.lang.Object r0 = r7.get(r6)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r3 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r3 == 0) goto L63
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r7.next()
            r4 = r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r0) goto L5a
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L5a
            r4 = 1
            goto L5b
        L5a:
            r4 = 0
        L5b:
            if (r4 == 0) goto L45
            r1 = r3
        L5e:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L63
            return r1
        L63:
            return r0
    }

    private final kotlinx.coroutines.NodeList getOrPromoteCancellingList(kotlinx.coroutines.Incomplete r3) {
            r2 = this;
            kotlinx.coroutines.NodeList r0 = r3.getList()
            if (r0 != 0) goto L2b
            boolean r0 = r3 instanceof kotlinx.coroutines.Empty
            if (r0 == 0) goto L10
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            goto L2b
        L10:
            boolean r0 = r3 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L1b
            kotlinx.coroutines.JobNode r3 = (kotlinx.coroutines.JobNode) r3
            r2.promoteSingleToNodeList(r3)
            r0 = 0
            goto L2b
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "State should have list: "
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            return r0
    }

    private final boolean isCancelling(kotlinx.coroutines.Incomplete r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r0 == 0) goto Le
            kotlinx.coroutines.JobSupport$Finishing r2 = (kotlinx.coroutines.JobSupport.Finishing) r2
            boolean r2 = r2.isCancelling()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    private final boolean joinInternal() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto La
            r0 = 0
            return r0
        La:
            int r0 = r2.startInternal(r0)
            if (r0 < 0) goto L0
            r0 = 1
            return r0
    }

    private final java.lang.Object joinSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r3 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            kotlinx.coroutines.ResumeOnCompletion r1 = new kotlinx.coroutines.ResumeOnCompletion
            r1.<init>(r0)
            kotlinx.coroutines.DisposableHandle r1 = r3.invokeOnCompletion(r1)
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r0, r1)
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L26
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L26:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r4) goto L2d
            return r0
        L2d:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private final java.lang.Void loopOnState(kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r2) {
            r1 = this;
        L0:
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            r2.invoke(r0)
            goto L0
    }

    private final java.lang.Object makeCancelling(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r6.getState$kotlinx_coroutines_core()
            boolean r3 = r2 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r3 == 0) goto L52
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r3.isSealed()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L1a
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)
            return r7
        L1a:
            r3 = r2
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r3.isCancelling()     // Catch: java.lang.Throwable -> L4f
            if (r7 != 0) goto L25
            if (r3 != 0) goto L31
        L25:
            if (r1 != 0) goto L2b
            java.lang.Throwable r1 = r6.createCauseException(r7)     // Catch: java.lang.Throwable -> L4f
        L2b:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch: java.lang.Throwable -> L4f
            r7.addExceptionLocked(r1)     // Catch: java.lang.Throwable -> L4f
        L31:
            r7 = r2
            kotlinx.coroutines.JobSupport$Finishing r7 = (kotlinx.coroutines.JobSupport.Finishing) r7     // Catch: java.lang.Throwable -> L4f
            java.lang.Throwable r7 = r7.getRootCause()     // Catch: java.lang.Throwable -> L4f
            r1 = r3 ^ 1
            if (r1 == 0) goto L3d
            r0 = r7
        L3d:
            monitor-exit(r2)
            if (r0 != 0) goto L41
            goto L4a
        L41:
            kotlinx.coroutines.JobSupport$Finishing r2 = (kotlinx.coroutines.JobSupport.Finishing) r2
            kotlinx.coroutines.NodeList r7 = r2.getList()
            r6.notifyCancelling(r7, r0)
        L4a:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
        L4f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L52:
            boolean r3 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r3 == 0) goto L9a
            if (r1 != 0) goto L5c
            java.lang.Throwable r1 = r6.createCauseException(r7)
        L5c:
            r3 = r2
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r4 = r3.isActive()
            if (r4 == 0) goto L70
            boolean r2 = r6.tryMakeCancelling(r3, r1)
            if (r2 == 0) goto L2
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r7
        L70:
            kotlinx.coroutines.CompletedExceptionally r3 = new kotlinx.coroutines.CompletedExceptionally
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.tryMakeCompleting(r2, r3)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r3 == r4) goto L8a
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r3 != r2) goto L89
            goto L2
        L89:
            return r3
        L8a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L9a:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            return r7
    }

    private final kotlinx.coroutines.JobNode makeNode(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2, boolean r3) {
            r1 = this;
            r0 = 0
            if (r3 == 0) goto L12
            boolean r3 = r2 instanceof kotlinx.coroutines.JobCancellingNode
            if (r3 == 0) goto La
            r0 = r2
            kotlinx.coroutines.JobCancellingNode r0 = (kotlinx.coroutines.JobCancellingNode) r0
        La:
            if (r0 != 0) goto L26
            kotlinx.coroutines.InvokeOnCancelling r0 = new kotlinx.coroutines.InvokeOnCancelling
            r0.<init>(r2)
            goto L26
        L12:
            boolean r3 = r2 instanceof kotlinx.coroutines.JobNode
            if (r3 == 0) goto L1a
            r3 = r2
            kotlinx.coroutines.JobNode r3 = (kotlinx.coroutines.JobNode) r3
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r3 != 0) goto L1e
            goto L1f
        L1e:
            r0 = r3
        L1f:
            if (r0 != 0) goto L26
            kotlinx.coroutines.InvokeOnCompletion r0 = new kotlinx.coroutines.InvokeOnCompletion
            r0.<init>(r2)
        L26:
            r0.setJob(r1)
            return r0
    }

    private final kotlinx.coroutines.ChildHandleNode nextChild(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            boolean r0 = r2.isRemoved()
            if (r0 == 0) goto Lb
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getPrevNode()
            goto L0
        Lb:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getNextNode()
            boolean r0 = r2.isRemoved()
            if (r0 == 0) goto L16
            goto Lb
        L16:
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 == 0) goto L1d
            kotlinx.coroutines.ChildHandleNode r2 = (kotlinx.coroutines.ChildHandleNode) r2
            return r2
        L1d:
            boolean r0 = r2 instanceof kotlinx.coroutines.NodeList
            if (r0 == 0) goto Lb
            r2 = 0
            return r2
    }

    private final void notifyCancelling(kotlinx.coroutines.NodeList r8, java.lang.Throwable r9) {
            r7 = this;
            r7.onCancelling(r9)
            java.lang.Object r0 = r8.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r1
        Lb:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r3 != 0) goto L4a
            boolean r3 = r0 instanceof kotlinx.coroutines.JobCancellingNode
            if (r3 == 0) goto L45
            r3 = r0
            kotlinx.coroutines.JobNode r3 = (kotlinx.coroutines.JobNode) r3
            r3.invoke(r9)     // Catch: java.lang.Throwable -> L1c
            goto L45
        L1c:
            r4 = move-exception
            if (r2 != 0) goto L21
            r5 = r1
            goto L25
        L21:
            kotlin.ExceptionsKt.addSuppressed(r2, r4)
            r5 = r2
        L25:
            if (r5 != 0) goto L45
            kotlinx.coroutines.CompletionHandlerException r2 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Exception in completion handler "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " for "
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3, r4)
        L45:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto Lb
        L4a:
            if (r2 != 0) goto L4d
            goto L50
        L4d:
            r7.handleOnCompletionException$kotlinx_coroutines_core(r2)
        L50:
            r7.cancelParent(r9)
            return
    }

    private final void notifyCompletion(kotlinx.coroutines.NodeList r8, java.lang.Throwable r9) {
            r7 = this;
            java.lang.Object r0 = r8.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r3 != 0) goto L47
            boolean r3 = r0 instanceof kotlinx.coroutines.JobNode
            if (r3 == 0) goto L42
            r3 = r0
            kotlinx.coroutines.JobNode r3 = (kotlinx.coroutines.JobNode) r3
            r3.invoke(r9)     // Catch: java.lang.Throwable -> L19
            goto L42
        L19:
            r4 = move-exception
            if (r2 != 0) goto L1e
            r5 = r1
            goto L22
        L1e:
            kotlin.ExceptionsKt.addSuppressed(r2, r4)
            r5 = r2
        L22:
            if (r5 != 0) goto L42
            kotlinx.coroutines.CompletionHandlerException r2 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Exception in completion handler "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " for "
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3, r4)
        L42:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L8
        L47:
            if (r2 != 0) goto L4a
            goto L4d
        L4a:
            r7.handleOnCompletionException$kotlinx_coroutines_core(r2)
        L4d:
            return
    }

    private final /* synthetic */ <T extends kotlinx.coroutines.JobNode> void notifyHandlers(kotlinx.coroutines.NodeList r8, java.lang.Throwable r9) {
            r7 = this;
            java.lang.Object r0 = r8.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r3 != 0) goto L4d
            r3 = 3
            java.lang.String r4 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r3, r4)
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r3 == 0) goto L48
            r3 = r0
            kotlinx.coroutines.JobNode r3 = (kotlinx.coroutines.JobNode) r3
            r3.invoke(r9)     // Catch: java.lang.Throwable -> L1f
            goto L48
        L1f:
            r4 = move-exception
            if (r2 != 0) goto L24
            r5 = r1
            goto L28
        L24:
            kotlin.ExceptionsKt.addSuppressed(r2, r4)
            r5 = r2
        L28:
            if (r5 != 0) goto L48
            kotlinx.coroutines.CompletionHandlerException r2 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Exception in completion handler "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " for "
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3, r4)
        L48:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L8
        L4d:
            if (r2 != 0) goto L50
            goto L53
        L50:
            r7.handleOnCompletionException$kotlinx_coroutines_core(r2)
        L53:
            return
    }

    private final void promoteEmptyToNodeList(kotlinx.coroutines.Empty r4) {
            r3 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            boolean r1 = r4.isActive()
            if (r1 == 0) goto Lc
            goto L12
        Lc:
            kotlinx.coroutines.InactiveNodeList r1 = new kotlinx.coroutines.InactiveNodeList
            r1.<init>(r0)
            r0 = r1
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
        L14:
            boolean r2 = r1.compareAndSet(r3, r4, r0)
            if (r2 == 0) goto L1b
            goto L21
        L1b:
            java.lang.Object r2 = r1.get(r3)
            if (r2 == r4) goto L14
        L21:
            return
    }

    private final void promoteSingleToNodeList(kotlinx.coroutines.JobNode r4) {
            r3 = this;
            kotlinx.coroutines.NodeList r0 = new kotlinx.coroutines.NodeList
            r0.<init>()
            r4.addOneIfEmpty(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r4.getNextNode()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
        Le:
            boolean r2 = r1.compareAndSet(r3, r4, r0)
            if (r2 == 0) goto L15
            goto L1b
        L15:
            java.lang.Object r2 = r1.get(r3)
            if (r2 == r4) goto Le
        L1b:
            return
    }

    private final int startInternal(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.Empty
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2c
            r0 = r7
            kotlinx.coroutines.Empty r0 = (kotlinx.coroutines.Empty) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L11
            return r3
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r4 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
        L17:
            boolean r5 = r0.compareAndSet(r6, r7, r4)
            if (r5 == 0) goto L1f
            r3 = 1
            goto L25
        L1f:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r7) goto L17
        L25:
            if (r3 != 0) goto L28
            return r1
        L28:
            r6.onStart()
            return r2
        L2c:
            boolean r0 = r7 instanceof kotlinx.coroutines.InactiveNodeList
            if (r0 == 0) goto L4e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            r4 = r7
            kotlinx.coroutines.InactiveNodeList r4 = (kotlinx.coroutines.InactiveNodeList) r4
            kotlinx.coroutines.NodeList r4 = r4.getList()
        L39:
            boolean r5 = r0.compareAndSet(r6, r7, r4)
            if (r5 == 0) goto L41
            r3 = 1
            goto L47
        L41:
            java.lang.Object r5 = r0.get(r6)
            if (r5 == r7) goto L39
        L47:
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.onStart()
            return r2
        L4e:
            return r3
    }

    private final java.lang.String stateString(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1a
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3
            boolean r0 = r3.isCancelling()
            if (r0 == 0) goto L11
            java.lang.String r1 = "Cancelling"
            goto L33
        L11:
            boolean r3 = r3.isCompleting()
            if (r3 == 0) goto L33
            java.lang.String r1 = "Completing"
            goto L33
        L1a:
            boolean r0 = r3 instanceof kotlinx.coroutines.Incomplete
            if (r0 == 0) goto L2a
            kotlinx.coroutines.Incomplete r3 = (kotlinx.coroutines.Incomplete) r3
            boolean r3 = r3.isActive()
            if (r3 == 0) goto L27
            goto L33
        L27:
            java.lang.String r1 = "New"
            goto L33
        L2a:
            boolean r3 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            goto L33
        L31:
            java.lang.String r1 = "Completed"
        L33:
            return r1
    }

    public static /* synthetic */ java.util.concurrent.CancellationException toCancellationException$default(kotlinx.coroutines.JobSupport r0, java.lang.Throwable r1, java.lang.String r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            java.util.concurrent.CancellationException r0 = r0.toCancellationException(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: toCancellationException"
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryFinalizeSimpleState(kotlinx.coroutines.Incomplete r6, java.lang.Object r7) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.JobSupport._state$FU
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.boxIncomplete(r7)
        L6:
            boolean r2 = r0.compareAndSet(r5, r6, r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L10
            r0 = 1
            goto L17
        L10:
            java.lang.Object r2 = r0.get(r5)
            if (r2 == r6) goto L6
            r0 = 0
        L17:
            if (r0 != 0) goto L1a
            return r3
        L1a:
            r0 = 0
            r5.onCancelling(r0)
            r5.onCompletionInternal(r7)
            r5.completeStateFinalization(r6, r7)
            return r4
    }

    private final boolean tryMakeCancelling(kotlinx.coroutines.Incomplete r7, java.lang.Throwable r8) {
            r6 = this;
            kotlinx.coroutines.NodeList r0 = r6.getOrPromoteCancellingList(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlinx.coroutines.JobSupport$Finishing r2 = new kotlinx.coroutines.JobSupport$Finishing
            r2.<init>(r0, r1, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.JobSupport._state$FU
        Lf:
            boolean r4 = r3.compareAndSet(r6, r7, r2)
            r5 = 1
            if (r4 == 0) goto L18
            r7 = 1
            goto L1f
        L18:
            java.lang.Object r4 = r3.get(r6)
            if (r4 == r7) goto Lf
            r7 = 0
        L1f:
            if (r7 != 0) goto L22
            return r1
        L22:
            r6.notifyCancelling(r0, r8)
            return r5
    }

    private final java.lang.Object tryMakeCompleting(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.Incomplete
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            return r2
        L9:
            boolean r0 = r2 instanceof kotlinx.coroutines.Empty
            if (r0 != 0) goto L11
            boolean r0 = r2 instanceof kotlinx.coroutines.JobNode
            if (r0 == 0) goto L27
        L11:
            boolean r0 = r2 instanceof kotlinx.coroutines.ChildHandleNode
            if (r0 != 0) goto L27
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 != 0) goto L27
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            boolean r2 = r1.tryFinalizeSimpleState(r2, r3)
            if (r2 == 0) goto L22
            return r3
        L22:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r2
        L27:
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            java.lang.Object r2 = r1.tryMakeCompletingSlowPath(r2, r3)
            return r2
    }

    private final java.lang.Object tryMakeCompletingSlowPath(kotlinx.coroutines.Incomplete r8, java.lang.Object r9) {
            r7 = this;
            kotlinx.coroutines.NodeList r0 = r7.getOrPromoteCancellingList(r8)
            if (r0 != 0) goto Lb
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            return r8
        Lb:
            boolean r1 = r8 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L14
            r1 = r8
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            goto L15
        L14:
            r1 = r2
        L15:
            r3 = 0
            if (r1 != 0) goto L1d
            kotlinx.coroutines.JobSupport$Finishing r1 = new kotlinx.coroutines.JobSupport$Finishing
            r1.<init>(r0, r3, r2)
        L1d:
            monitor-enter(r1)
            boolean r4 = r1.isCompleting()     // Catch: java.lang.Throwable -> L82
            if (r4 == 0) goto L2a
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r1)
            return r8
        L2a:
            r4 = 1
            r1.setCompleting(r4)     // Catch: java.lang.Throwable -> L82
            if (r1 == r8) goto L48
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.JobSupport._state$FU     // Catch: java.lang.Throwable -> L82
        L32:
            boolean r6 = r5.compareAndSet(r7, r8, r1)     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L3a
            r3 = 1
            goto L40
        L3a:
            java.lang.Object r6 = r5.get(r7)     // Catch: java.lang.Throwable -> L82
            if (r6 == r8) goto L32
        L40:
            if (r3 != 0) goto L48
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r1)
            return r8
        L48:
            boolean r3 = r1.isCancelling()     // Catch: java.lang.Throwable -> L82
            boolean r5 = r9 instanceof kotlinx.coroutines.CompletedExceptionally     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L54
            r5 = r9
            kotlinx.coroutines.CompletedExceptionally r5 = (kotlinx.coroutines.CompletedExceptionally) r5     // Catch: java.lang.Throwable -> L82
            goto L55
        L54:
            r5 = r2
        L55:
            if (r5 != 0) goto L58
            goto L5d
        L58:
            java.lang.Throwable r5 = r5.cause     // Catch: java.lang.Throwable -> L82
            r1.addExceptionLocked(r5)     // Catch: java.lang.Throwable -> L82
        L5d:
            java.lang.Throwable r5 = r1.getRootCause()     // Catch: java.lang.Throwable -> L82
            r3 = r3 ^ r4
            if (r3 == 0) goto L65
            r2 = r5
        L65:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L82
            monitor-exit(r1)
            if (r2 != 0) goto L6b
            goto L6e
        L6b:
            r7.notifyCancelling(r0, r2)
        L6e:
            kotlinx.coroutines.ChildHandleNode r8 = r7.firstChild(r8)
            if (r8 == 0) goto L7d
            boolean r8 = r7.tryWaitForChild(r1, r8, r9)
            if (r8 == 0) goto L7d
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            return r8
        L7d:
            java.lang.Object r8 = r7.finalizeFinishingState(r1, r9)
            return r8
        L82:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    private final boolean tryWaitForChild(kotlinx.coroutines.JobSupport.Finishing r7, kotlinx.coroutines.ChildHandleNode r8, java.lang.Object r9) {
            r6 = this;
        L0:
            kotlinx.coroutines.ChildJob r0 = r8.childJob
            r1 = 0
            r2 = 0
            kotlinx.coroutines.JobSupport$ChildCompletion r3 = new kotlinx.coroutines.JobSupport$ChildCompletion
            r3.<init>(r6, r7, r8, r9)
            r4 = 1
            r5 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r0 == r1) goto L15
            r7 = 1
            return r7
        L15:
            kotlinx.coroutines.ChildHandleNode r8 = r6.nextChild(r8)
            if (r8 != 0) goto L0
            r7 = 0
            return r7
    }

    public void afterCompletion(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.ChildHandle attachChild(@org.jetbrains.annotations.NotNull kotlinx.coroutines.ChildJob r7) {
            r6 = this;
            kotlinx.coroutines.ChildHandleNode r3 = new kotlinx.coroutines.ChildHandleNode
            r3.<init>(r7)
            r1 = 1
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            kotlinx.coroutines.DisposableHandle r7 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.ChildHandle r7 = (kotlinx.coroutines.ChildHandle) r7
            return r7
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object awaitInternal$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<java.lang.Object> r3) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L16
            boolean r3 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 != 0) goto L11
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r3
        L11:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r3 = r0.cause
            throw r3
        L16:
            int r0 = r2.startInternal(r0)
            if (r0 < 0) goto L0
            java.lang.Object r3 = r2.awaitSuspend(r3)
            return r3
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.Job.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            r3 = 0
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = access$cancellationExceptionMessage(r2)
            r0.<init>(r1, r3, r2)
            r3 = r0
        Ld:
            r2.cancelInternal(r3)
            return
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L6
            r4 = r1
            goto La
        L6:
            java.util.concurrent.CancellationException r4 = toCancellationException$default(r3, r4, r1, r0, r1)
        La:
            if (r4 != 0) goto L15
            kotlinx.coroutines.JobCancellationException r4 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r2 = access$cancellationExceptionMessage(r3)
            r4.<init>(r2, r1, r3)
        L15:
            r3.cancelInternal(r4)
            return r0
    }

    public final boolean cancelCoroutine(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.cancelImpl$kotlinx_coroutines_core(r1)
            return r1
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            boolean r1 = r3.getOnCancelComplete$kotlinx_coroutines_core()
            r2 = 1
            if (r1 == 0) goto L14
            java.lang.Object r0 = r3.cancelMakeCompleting(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto L14
            return r2
        L14:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r3.makeCancelling(r4)
        L1e:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r4) goto L25
            goto L35
        L25:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r4) goto L2a
            goto L35
        L2a:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.JobSupportKt.access$getTOO_LATE_TO_CANCEL$p()
            if (r0 != r4) goto L32
            r2 = 0
            goto L35
        L32:
            r3.afterCompletion(r0)
        L35:
            return r2
    }

    public void cancelInternal(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String cancellationExceptionMessage() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    public boolean childCancelled(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r3 = r2.cancelImpl$kotlinx_coroutines_core(r3)
            if (r3 == 0) goto L13
            boolean r3 = r2.getHandlesException$kotlinx_coroutines_core()
            if (r3 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.JobCancellationException defaultCancellationException$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r1 = this;
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            if (r2 != 0) goto L8
            java.lang.String r2 = access$cancellationExceptionMessage(r1)
        L8:
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.Job.DefaultImpls.fold(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<E> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext$Element r1 = kotlinx.coroutines.Job.DefaultImpls.get(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.CancellationException getCancellationException() {
            r4 = this;
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            java.lang.String r2 = "Job is still new or active: "
            r3 = 0
            if (r1 == 0) goto L33
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            java.lang.Throwable r0 = r0.getRootCause()
            if (r0 != 0) goto L14
            goto L22
        L14:
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r4)
            java.lang.String r3 = " is cancelling"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            java.util.concurrent.CancellationException r3 = r4.toCancellationException(r0, r1)
        L22:
            if (r3 == 0) goto L25
            goto L55
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L56
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L45
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            r1 = 1
            java.util.concurrent.CancellationException r3 = toCancellationException$default(r4, r0, r3, r1, r3)
            goto L55
        L45:
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r4)
            java.lang.String r2 = " has completed normally"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r2)
            r0.<init>(r1, r3, r4)
            r3 = r0
        L55:
            return r3
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.ParentJob
    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.CancellationException getChildJobCancellationCause() {
            r4 = this;
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            r2 = 0
            if (r1 == 0) goto L11
            r1 = r0
            kotlinx.coroutines.JobSupport$Finishing r1 = (kotlinx.coroutines.JobSupport.Finishing) r1
            java.lang.Throwable r1 = r1.getRootCause()
            goto L20
        L11:
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L1b
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            goto L20
        L1b:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L39
            r1 = r2
        L20:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L27
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L27:
            if (r2 != 0) goto L38
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = r4.stateString(r0)
            java.lang.String r3 = "Parent job is "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r3, r0)
            r2.<init>(r0, r1, r4)
        L38:
            return r2
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot be cancelling child in this state: "
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public final kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
            r2 = this;
            kotlinx.coroutines.JobSupport$children$1 r0 = new kotlinx.coroutines.JobSupport$children$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCompletedInternal$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            r1 = r1 ^ 1
            if (r1 == 0) goto L18
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L13
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            return r0
        L13:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable getCompletionExceptionOrNull() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            r1 = r1 ^ 1
            if (r1 == 0) goto Lf
            java.lang.Throwable r0 = r2.getExceptionOrNull(r0)
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job has not completed yet"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            return r0
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
            r0 = this;
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.ChildHandle getParentHandle$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            kotlinx.coroutines.ChildHandle r0 = (kotlinx.coroutines.ChildHandle) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._state
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r1 != 0) goto L7
            return r0
        L7:
            kotlinx.coroutines.internal.OpDescriptor r0 = (kotlinx.coroutines.internal.OpDescriptor) r0
            r0.perform(r2)
            goto L0
    }

    public boolean handleJobException(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull java.lang.Throwable r1) {
            r0 = this;
            throw r1
    }

    public final void initParentJob(@org.jetbrains.annotations.Nullable kotlinx.coroutines.Job r2) {
            r1 = this;
            if (r2 != 0) goto L8
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r1.setParentHandle$kotlinx_coroutines_core(r2)
            return
        L8:
            r2.start()
            kotlinx.coroutines.ChildHandle r2 = r2.attachChild(r1)
            r1.setParentHandle$kotlinx_coroutines_core(r2)
            boolean r0 = r1.isCompleted()
            if (r0 == 0) goto L20
            r2.dispose()
            kotlinx.coroutines.NonDisposableHandle r2 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r1.setParentHandle$kotlinx_coroutines_core(r2)
        L20:
            return
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.DisposableHandle r3 = r2.invokeOnCompletion(r0, r1, r3)
            return r3
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9) {
            r6 = this;
            kotlinx.coroutines.JobNode r0 = r6.makeNode(r9, r7)
        L4:
            java.lang.Object r1 = r6.getState$kotlinx_coroutines_core()
            boolean r2 = r1 instanceof kotlinx.coroutines.Empty
            if (r2 == 0) goto L2d
            r2 = r1
            kotlinx.coroutines.Empty r2 = (kotlinx.coroutines.Empty) r2
            boolean r3 = r2.isActive()
            if (r3 == 0) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.JobSupport._state$FU
        L17:
            boolean r2 = r3.compareAndSet(r6, r1, r0)
            if (r2 == 0) goto L1f
            r1 = 1
            goto L26
        L1f:
            java.lang.Object r2 = r3.get(r6)
            if (r2 == r1) goto L17
            r1 = 0
        L26:
            if (r1 == 0) goto L4
            return r0
        L29:
            r6.promoteEmptyToNodeList(r2)
            goto L4
        L2d:
            boolean r2 = r1 instanceof kotlinx.coroutines.Incomplete
            r3 = 0
            if (r2 == 0) goto L88
            r2 = r1
            kotlinx.coroutines.Incomplete r2 = (kotlinx.coroutines.Incomplete) r2
            kotlinx.coroutines.NodeList r2 = r2.getList()
            if (r2 != 0) goto L46
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            java.util.Objects.requireNonNull(r1, r2)
            kotlinx.coroutines.JobNode r1 = (kotlinx.coroutines.JobNode) r1
            r6.promoteSingleToNodeList(r1)
            goto L4
        L46:
            kotlinx.coroutines.NonDisposableHandle r4 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            if (r7 == 0) goto L79
            boolean r5 = r1 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r5 == 0) goto L79
            monitor-enter(r1)
            r3 = r1
            kotlinx.coroutines.JobSupport$Finishing r3 = (kotlinx.coroutines.JobSupport.Finishing) r3     // Catch: java.lang.Throwable -> L76
            java.lang.Throwable r3 = r3.getRootCause()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L65
            boolean r5 = r9 instanceof kotlinx.coroutines.ChildHandleNode     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L72
            r5 = r1
            kotlinx.coroutines.JobSupport$Finishing r5 = (kotlinx.coroutines.JobSupport.Finishing) r5     // Catch: java.lang.Throwable -> L76
            boolean r5 = r5.isCompleting()     // Catch: java.lang.Throwable -> L76
            if (r5 != 0) goto L72
        L65:
            boolean r4 = r6.addLastAtomic(r1, r2, r0)     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L6d
            monitor-exit(r1)
            goto L4
        L6d:
            if (r3 != 0) goto L71
            monitor-exit(r1)
            return r0
        L71:
            r4 = r0
        L72:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L76
            monitor-exit(r1)
            goto L79
        L76:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L79:
            if (r3 == 0) goto L81
            if (r8 == 0) goto L80
            r9.invoke(r3)
        L80:
            return r4
        L81:
            boolean r1 = r6.addLastAtomic(r1, r2, r0)
            if (r1 == 0) goto L4
            return r0
        L88:
            if (r8 == 0) goto L9a
            boolean r7 = r1 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r7 == 0) goto L91
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            goto L92
        L91:
            r1 = r3
        L92:
            if (r1 != 0) goto L95
            goto L97
        L95:
            java.lang.Throwable r3 = r1.cause
        L97:
            r9.invoke(r3)
        L9a:
            kotlinx.coroutines.NonDisposableHandle r7 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            return r7
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L12
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            boolean r0 = r0.isActive()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L17
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.Finishing
            if (r1 == 0) goto L15
            kotlinx.coroutines.JobSupport$Finishing r0 = (kotlinx.coroutines.JobSupport.Finishing) r0
            boolean r0 = r0.isCancelling()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.Incomplete
            r0 = r0 ^ 1
            return r0
    }

    public final boolean isCompletedExceptionally() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            return r0
    }

    public boolean isScopedCoroutine() {
            r0 = this;
            boolean r0 = r0 instanceof kotlinx.coroutines.BlockingCoroutine
            return r0
    }

    @Override // kotlinx.coroutines.Job
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object join(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            boolean r0 = r1.joinInternal()
            if (r0 != 0) goto L10
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            kotlinx.coroutines.JobKt.ensureActive(r2)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L10:
            java.lang.Object r2 = r1.joinSuspend(r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L1b
            return r2
        L1b:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = r3.tryMakeCompleting(r0, r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 != r1) goto L10
            r4 = 0
            return r4
        L10:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            r2 = 1
            if (r0 != r1) goto L16
            return r2
        L16:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 != r1) goto L1d
            goto L0
        L1d:
            r3.afterCompletion(r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object makeCompletingOnce$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = r3.tryMakeCompleting(r0, r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_ALREADY$p()
            if (r0 == r1) goto L16
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.access$getCOMPLETING_RETRY$p()
            if (r0 != r1) goto L15
            goto L0
        L15:
            return r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Job "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " is already complete or completing, but is being completed with "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Throwable r4 = r3.getExceptionOrNull(r4)
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext.Key<?> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.Job.DefaultImpls.minusKey(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String nameString$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.String r0 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
            return r0
    }

    public void onCancelling(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            return
    }

    public void onCompletionInternal(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            return
    }

    public void onStart() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(@org.jetbrains.annotations.NotNull kotlinx.coroutines.ParentJob r1) {
            r0 = this;
            r0.cancelImpl$kotlinx_coroutines_core(r1)
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.Job
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.Job plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.Job r1) {
            r0 = this;
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.Job.DefaultImpls.plus(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.selects.SelectClause0
    public final <R> void registerSelectClause0(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<? super R> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r3.isSelected()
            if (r1 == 0) goto Lb
            return
        Lb:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L1d
            boolean r0 = r3.trySelect()
            if (r0 == 0) goto L1c
            kotlin.coroutines.Continuation r3 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r4, r3)
        L1c:
            return
        L1d:
            int r0 = r2.startInternal(r0)
            if (r0 != 0) goto L0
            kotlinx.coroutines.SelectJoinOnCompletion r0 = new kotlinx.coroutines.SelectJoinOnCompletion
            r0.<init>(r3, r4)
            kotlinx.coroutines.DisposableHandle r4 = r2.invokeOnCompletion(r0)
            r3.disposeOnSelect(r4)
            return
    }

    public final <T, R> void registerSelectClause1Internal$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<? super R> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r3.isSelected()
            if (r1 == 0) goto Lb
            return
        Lb:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 != 0) goto L2d
            boolean r1 = r3.trySelect()
            if (r1 == 0) goto L2c
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L21
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r4 = r0.cause
            r3.resumeSelectWithException(r4)
            goto L2c
        L21:
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            kotlin.coroutines.Continuation r3 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r4, r0, r3)
        L2c:
            return
        L2d:
            int r0 = r2.startInternal(r0)
            if (r0 != 0) goto L0
            kotlinx.coroutines.SelectAwaitOnCompletion r0 = new kotlinx.coroutines.SelectAwaitOnCompletion
            r0.<init>(r3, r4)
            kotlinx.coroutines.DisposableHandle r4 = r2.invokeOnCompletion(r0)
            r3.disposeOnSelect(r4)
            return
    }

    public final void removeNode$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlinx.coroutines.JobNode r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.JobNode
            if (r1 == 0) goto L23
            if (r0 == r5) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.JobSupport._state$FU
            kotlinx.coroutines.Empty r2 = kotlinx.coroutines.JobSupportKt.access$getEMPTY_ACTIVE$p()
        L11:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L19
            r0 = 1
            goto L20
        L19:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L11
            r0 = 0
        L20:
            if (r0 == 0) goto L0
            return
        L23:
            boolean r1 = r0 instanceof kotlinx.coroutines.Incomplete
            if (r1 == 0) goto L32
            kotlinx.coroutines.Incomplete r0 = (kotlinx.coroutines.Incomplete) r0
            kotlinx.coroutines.NodeList r0 = r0.getList()
            if (r0 == 0) goto L32
            r5.mo1865remove()
        L32:
            return
    }

    public final <T, R> void selectAwaitCompletion$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectInstance<? super R> r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r8) {
            r6 = this;
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L10
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r8 = r0.cause
            r7.resumeSelectWithException(r8)
            goto L1f
        L10:
            java.lang.Object r1 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            kotlin.coroutines.Continuation r2 = r7.getCompletion()
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r8
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r0, r1, r2, r3, r4, r5)
        L1f:
            return
    }

    public final void setParentHandle$kotlinx_coroutines_core(@org.jetbrains.annotations.Nullable kotlinx.coroutines.ChildHandle r1) {
            r0 = this;
            r0._parentHandle = r1
            return
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            int r0 = r2.startInternal(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Le
            goto L0
        Le:
            return r1
        Lf:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.CancellationException toCancellationException(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.Nullable java.lang.String r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8
            r0 = r2
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L16
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            if (r3 != 0) goto L13
            java.lang.String r3 = access$cancellationExceptionMessage(r1)
        L13:
            r0.<init>(r3, r2, r1)
        L16:
            return r0
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString$kotlinx_coroutines_core()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            java.lang.Object r1 = r2.getState$kotlinx_coroutines_core()
            java.lang.String r1 = r2.stateString(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.toDebugString()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
