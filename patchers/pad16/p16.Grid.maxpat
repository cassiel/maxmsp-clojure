{
	"patcher" : 	{
		"fileversion" : 1,
		"appversion" : 		{
			"major" : 5,
			"minor" : 1,
			"revision" : 9
		}
,
		"rect" : [ 60.0, 227.0, 641.0, 590.0 ],
		"bglocked" : 0,
		"defrect" : [ 60.0, 227.0, 641.0, 590.0 ],
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
					"maxclass" : "outlet",
					"numinlets" : 1,
					"numoutlets" : 0,
					"patching_rect" : [ 265.0, 530.0, 25.0, 25.0 ],
					"id" : "obj-9",
					"comment" : "0..3 (col) * 0..3 (row) * 0/1"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "newobj",
					"text" : "funnel 4",
					"fontname" : "Anonymous Pro",
					"numinlets" : 4,
					"fontsize" : 12.0,
					"numoutlets" : 1,
					"outlettype" : [ "list" ],
					"patching_rect" : [ 265.0, 495.0, 63.0, 18.0 ],
					"id" : "obj-7"
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
					"patching_rect" : [ 230.0, 80.0, 96.0, 18.0 ],
					"id" : "obj-6"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "inlet",
					"numinlets" : 0,
					"numoutlets" : 1,
					"outlettype" : [ "" ],
					"patching_rect" : [ 250.0, 25.0, 25.0, 25.0 ],
					"id" : "obj-5",
					"comment" : ""
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Column.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 260.0, 20.0, 75.0, 315.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "list" ],
					"patching_rect" : [ 410.0, 145.0, 75.0, 315.0 ],
					"presentation" : 1,
					"id" : "obj-4"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Column.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 180.0, 20.0, 75.0, 315.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "list" ],
					"patching_rect" : [ 320.0, 145.0, 75.0, 315.0 ],
					"presentation" : 1,
					"id" : "obj-3"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Column.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 100.0, 20.0, 75.0, 315.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "list" ],
					"patching_rect" : [ 230.0, 145.0, 75.0, 315.0 ],
					"presentation" : 1,
					"id" : "obj-2"
				}

			}
, 			{
				"box" : 				{
					"maxclass" : "bpatcher",
					"name" : "p16.Column.maxpat",
					"args" : [  ],
					"numinlets" : 1,
					"presentation_rect" : [ 20.0, 20.0, 75.0, 315.0 ],
					"numoutlets" : 1,
					"offset" : [ -20.0, -20.0 ],
					"outlettype" : [ "list" ],
					"patching_rect" : [ 140.0, 145.0, 75.0, 315.0 ],
					"presentation" : 1,
					"id" : "obj-1"
				}

			}
 ],
		"lines" : [ 			{
				"patchline" : 				{
					"source" : [ "obj-7", 0 ],
					"destination" : [ "obj-9", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-6", 3 ],
					"destination" : [ "obj-4", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-4", 0 ],
					"destination" : [ "obj-7", 3 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-6", 2 ],
					"destination" : [ "obj-3", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-3", 0 ],
					"destination" : [ "obj-7", 2 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-6", 1 ],
					"destination" : [ "obj-2", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-2", 0 ],
					"destination" : [ "obj-7", 1 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-6", 0 ],
					"destination" : [ "obj-1", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-1", 0 ],
					"destination" : [ "obj-7", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
, 			{
				"patchline" : 				{
					"source" : [ "obj-5", 0 ],
					"destination" : [ "obj-6", 0 ],
					"hidden" : 0,
					"midpoints" : [  ]
				}

			}
 ]
	}

}
