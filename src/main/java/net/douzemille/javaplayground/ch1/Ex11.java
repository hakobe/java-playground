package net.douzemille.javaplayground.ch1;

public class Ex11 {
    interface I_abstract {
        String f();
    }

    interface I_default {
        default String f() { return "I_default"; }
    }

    interface I_static {
        static String f() { return "I_static"; };
    }

    interface J_abstract {
        String f();
    }

    interface J_default {
        default String f() { return "J_default"; }
    }

    interface J_static {
        static String f() { return "J_static"; };
    }

    static class IaJa implements I_abstract, J_abstract {
        public String f() { return "IaJa"; }
    }

    static class IaJd implements I_abstract, J_default {
        public String f() { return J_default.super.f(); }
    }

    static class IaJs implements I_abstract, J_static {
        public String f() { return J_static.f(); }
    }

    static class IdJa implements I_default, J_abstract {
        public String f() { return I_default.super.f(); }
    }

    static class IdJd implements I_default, J_default {
        public String f() { return I_default.super.f(); }
    }

    static class IdJs implements I_default, J_static {}

    static class IsJa implements I_static, J_abstract {
        public String f() { return I_static.f(); }
    }

    static class IsJd implements I_static, J_default {}

    static class IsJs implements I_static, J_static {}
}
