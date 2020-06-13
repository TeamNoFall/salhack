package me.ionar.salhack.module.schematica;

import org.python.util.PythonInterpreter;
import me.ionar.salhack.module.Module;

public class JythoHelloWorld extends Module
{
    public JythoHelloWorld()
    {
        super("Jython", new String[] {"Jython"}, "A Jython Hello World module", "NONE", 0xDB24AB, ModuleType.SCHEMATICA);
    }

    @Override
    public void onEnable()
    {
        super.onEnable();
        pyInterp.exec("print('on Enable')");

    }

    @Override
    public void onDisable()
    {
        super.onDisable();
        pyInterp.exec("print('on Disable')");
    }
}
