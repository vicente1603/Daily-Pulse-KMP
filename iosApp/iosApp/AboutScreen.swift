//
//  AboutScreen.swift
//  iosApp
//
//  Created by Vicente Santiago on 20/05/26.
//  Copyright © 2026 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
        NavigationStack{
            AboutListView().navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutScreen()
}
