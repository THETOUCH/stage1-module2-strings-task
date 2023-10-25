package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class MethodParser {
    public MethodSignature parseFunction(String signatureString) {
        List<MethodSignature.Argument> argumentList = new ArrayList<>();
        MethodSignature methodSignature;
        String[] signatureArray = signatureString.split("[(%)]");
        String[] mainSignatureArray = signatureArray[0].split(" ");
        String[] methodArgumentsArray;
        if (signatureArray.length==2) {
            methodArgumentsArray = signatureArray[1].split(", ");
            for (String s : methodArgumentsArray) {
                argumentList.add(new MethodSignature.Argument(s.split(" ")[0], s.split(" ")[1]));
            }
        }
        methodSignature = new MethodSignature("", argumentList);
        if (mainSignatureArray.length==3) {
            methodSignature.setAccessModifier(mainSignatureArray[0]);
            methodSignature.setReturnType(mainSignatureArray[1]);
            methodSignature.setMethodName(mainSignatureArray[2]);
        } else {
            methodSignature.setReturnType(mainSignatureArray[0]);
            methodSignature.setMethodName(mainSignatureArray[1]);
        }
        return methodSignature;
    }
}
