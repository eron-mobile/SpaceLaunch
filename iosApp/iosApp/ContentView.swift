import SwiftUI

struct ContentView: View {
    var body: some View {
        VStack(spacing: 16) {
            Image(systemName: "airplane")
                .font(.system(size: 80))
                .foregroundColor(.accentColor)
            Text("SpaceLaunch")
                .font(.largeTitle)
                .fontWeight(.bold)
            Text("Launches • ISS Tracker • News")
                .font(.subheadline)
                .foregroundColor(.secondary)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
