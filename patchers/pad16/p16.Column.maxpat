{
	"patcher" : 	{
		"fileversion" : 1,
		"appversion" : 		{
			"major" : 5,
			"minor" : 1,
			"revision" : 9
		}
,
		"rect" : [ 730.0, 228.0, 667.0, 556.0 ],
		"bglocked" : 0,
		"defrect" : [ 730.0, 228.0, 667.0, 556.0 ],
		"openrect" : [ 0.0, 0.0, 0.0, 0.0 ],
		"openinpresentation" : 1,
		"default_fontsize" : 12.0,
		"default_fontface" : 0,
		"default_fontname" : "Anonymous Pro",
		"gridonopen" : 0,
		"gridsize" : [ 5.0, 5.0 ],
		"gridsnaponopen" : 0,
		"toolbarvisible" : 1,
		"boxanimatetime" : 200,
		"imprint" : 0,
		"enablehscroll" : 1,
		"enablevscroll" : 1,
		"devicewidth" : 0.0,
		"boxes" : [ 			{
				"box" : 				{
					"maxclass" : "newobj",
					"text" : "funnel 4",
					"fontname" : "Anonymous Pro",
					"numinlets" : 4,
					"fontsize" : 12.0,
					"numoutlets" : 1,
					"outlettype" : [ "list" ],
					"patching_rect" : [ 225.0, 460.0, 63.0, 18.0 ],
					"id" : "obj-12"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "inlet",
					"numinlets" : 0,
					"numoutlets" : 1,
					"outlettype" : [ "" ],
					"patching_rect" : [ 440.0, 35.0, 25.0, 25.0 ],
					"id" : "obj-11",
					"comment" : "0..3 (col) * 0..3 (row) * RGB"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "newobj",
					"text" : "route 0 1 2 3",
					"fontname" : "Anonymous Pro",
					"numinlets" : 1,
					"fontsize" : 12.0,
					"numoutlets" : 5,
					"outlettype" : [ "", "", "", "", "" ],
					"patching_rect" : [ 360.0, 110.0, 96.0, 18.0 ],
					"id" : "obj-10"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "outlet",
					"numinlets" : 1,
					"numoutlets" : 0,
					"patching_rect" : [ 175.0, 520.0, 25.0, 25.0 ],
					"id" : "obj-9",
					"comment" : "0..3 (row) * 0/1"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Cell.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 20.0, 260.0, 75.0, 75.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "" ],
					"patching_rect" : [ 395.0, 370.0, 75.0, 75.0 ],
					"presentation" : 1,
					"id" : "obj-4"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Cell.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 20.0, 180.0, 75.0, 75.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "" ],
					"patching_rect" : [ 320.0, 295.0, 75.0, 75.0 ],
					"presentation" : 1,
					"id" : "obj-3"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Cell.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 20.0, 100.0, 75.0, 75.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "" ],
					"patching_rect" : [ 245.0, 220.0, 75.0, 75.0 ],
					"presentation" : 1,
					"id" : "obj-2"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Cell.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 20.0, 20.0, 75.0, 75.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "" ],
					"patching_rect" : [ 170.0, 145.0, 75.0, 75.0 ],
					"presentation" : 1,
					"id" : "obj-1"
				}

			}
 ],
		"lines" : [ 			{
				"patchline" : 				{
					"source" : [ "obj-12", 0 ],
					"destination" : [ "obj-9", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-4", 0 ],
					"destination" : [ "obj-12", 3 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-3", 0 ],
					"destination" : [ "obj-12", 2 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-2", 0 ],
					"destination" : [ "obj-12", 1 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-1", 0 ],
					"destination" : [ "obj-12", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-11", 0 ],
					"destination" : [ "obj-10", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-10", 3 ],
					"destination" : [ "obj-4", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-10", 2 ],
					"destination" : [ "obj-3", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-10", 1 ],
					"destination" : [ "obj-2", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-10", 0 ],
					"destination" : [ "obj-1", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
 ]
	}

}
