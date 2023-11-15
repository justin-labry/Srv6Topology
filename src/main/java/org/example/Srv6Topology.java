package org.example;

import java.util.ArrayList;

public class Srv6Topology{
    public ArrayList<Device> devices;
    public ArrayList<Srv6policy> srv6policies;
    public ArrayList<Srv6steeringrule> srv6steeringrule;
}

class Device{
    public int index;
    public String name;
    public Srv6 srv6;
}

class EndXSid{
    public int index;
    public String end_x_sid;
    public ArrayList<String> connect_point_src;
    public Srv6SidStructure srv6_sid_structure;
}

class Srv6{
    public String systemId;
    public ArrayList<Srv6locator> srv6locators;
}

class Srv6locator{
    public int index;
    public String locator;
    public Srv6SidStructure srv6_sid_structure;
    public String end_sid;
    public ArrayList<EndXSid> end_x_sids;
}

class Srv6SidStructure{
    public String lb_length;
    public String ln_length;
    public String fun_length;
    public String arg_length;
}

class Srv6steeringrule{
    public int index;
    public String name;
    public String protocol;
    public String dst;
    public String srv6policy;
}


class Srv6policy{
    public long hashkey; // get using combination of headend, color, endpoint
    public int index;
    public String name;
    public String headend;
    public int color;
    public String endpoint;
    public SegmentList segment_list;
}

class SegmentList{
    public String name;
    public int wegith;
    public String mode;
    public String tunnel_src_ip;
    public ArrayList<String> sids;
}
