package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynEnumHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u202/12323/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Saturday, December 15, 2018 8:18:17 PM PST
*/


/**
    * DynEnum objects support the manipulation of IDL enumerated values.
    * The current position of a DynEnum is always -1.
    */
abstract public class DynEnumHelper
{
  private static String  _id = "IDL:omg.org/DynamicAny/DynEnum:1.0";

  public static void insert (org.omg.CORBA.Any a, DynEnum that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DynEnum extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DynEnumHelper.id (), "DynEnum");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DynEnum read (org.omg.CORBA.portable.InputStream istream)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DynEnum value)
  {
      throw new org.omg.CORBA.MARSHAL ();
  }

  public static DynEnum narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynEnum)
      return (DynEnum)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynEnumStub stub = new _DynEnumStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static DynEnum unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof DynEnum)
      return (DynEnum)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DynEnumStub stub = new _DynEnumStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
